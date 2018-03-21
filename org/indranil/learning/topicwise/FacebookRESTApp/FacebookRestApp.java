package org.indranil.learning.topicwise.FacebookRESTApp;

import java.util.List;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FriendList;
import com.restfb.types.User;
import com.restfb.types.UserInvitableFriend;

public class FacebookRestApp {
	
	public static void main(String[] args) {
		String access_token="EAACEdEose0cBALKlT9oGklVFlHrvMBNLiZCiQIDHA3ZAkpw3B2x5adVp1n2O3IL5dJ5hKliWZCY4HWXqzNvuoeDIJX1ZBm58ZBCPUZCtTVWiZBGULkKnFdAnYbZAkdLh4WXjpoWPErmy3KAwVW7xdChidgcf18EkWPJTjaZBfWUMgb70ZADt0GQYiZCIB5sTzZCv7YpEvKNYW7O1ZBgZDZD";
		FacebookClient fbClient = new DefaultFacebookClient(access_token);
		
		User me = fbClient.fetchObject("me", User.class);
		
		System.out.println("Me: " + me.getName());
		
		
		Connection<FriendList> friendsList = fbClient.fetchConnection("me/friends", FriendList.class, Parameter.with("limit", new Integer(1)));
		
		System.out.println("Total number of Friends : " +friendsList.getTotalCount());
		
		System.out.println("Friends are:- ");
		
		for(Integer limit=1;limit<=friendsList.getTotalCount();limit++) {
			System.out.println(friendsList.getNextPageUrl().split("after=")[1]);
						
			friendsList = fbClient.fetchConnection("me/friends", FriendList.class, Parameter.with("limit", limit), Parameter.with("after", friendsList.getNextPageUrl().split("after=")[1].toString()));
			
			for(List<FriendList> friends : friendsList) {
				//System.out.println(friends);
				for(FriendList friend : friends) {
					System.out.println(friend.getName());
				}
			}
			
		}
		
		//pretty=0&limit=2&after=QVFIUmxydERXV3ZALdWlOdFRhWTF1ejNNdzcyMzdCazRSTTJFUmdXUnNfdURLMVgxTm9SUFJXb1NramhaRmNwaUZAqV0gZD
		
		//System.out.println(friendsList);
		
		
		/*for(List<FriendList> friends : friendsList) {
			//System.out.println(friends);
			for(FriendList friend : friends) {
				System.out.println(friend.getName());
			}
			
		}
		
		System.out.println(friendsList.getNextPageUrl());
		
		System.out.println(friendsList.getAfterCursor());
		
		friendsList = fbClient.fetchConnection("me/friends", FriendList.class, Parameter.with("pretty", 0),Parameter.with("limit", 2),Parameter.with("next", friendsList.getAfterCursor().toString()));
		System.out.println(friendsList);
		for(List<FriendList> friends : friendsList) {
			//System.out.println(friends);
			for(FriendList friend : friends) {
				System.out.println(friend.getName());
			}
			
		}
		
		//System.out.println(friendsList.getAfterCursor());*/
		
		
		


	}

}
