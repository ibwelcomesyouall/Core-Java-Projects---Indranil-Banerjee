#!/bin/bash
create the below files:
Custom_FTP_Files.txt
FTP_client_check_in_HEDGEPROD_(Sybase).txt
FTP_client_check_in_P2DWA_(Oracle).txt
Futures_Daily_Statement_Call_Emails.txt
Futures_Margin_Call_Emails.txt
GMI_FTP_log.txt
IRS_Daily_Statement_Call_Emails.txt
IRS_FTP_log.txt
IRS_Margin_Call_Emails.txt
Log_check_for_Custom_FTP.txt
Log_check_for_IOException.txt
echo "1,1,IRS Margin Call Emails,2DWA_NEW_Send_IRS_Margin_Mail,ALert_ID#" > ReportDetails.txt
echo "1,1,IRS Daily Statement Call Emails,2DWA_NEW_Send_IRS_Statement_Mail,ALert_ID#" >> ReportDetails.txt
echo "1,1,Futures Margin Call Emails,2DWA_NEW_Send_GMI_Margin_Mail,ALert_ID#" >> ReportDetails.txt
echo "1,1,Futures Daily Statement Call Emails,2DWA_NEW_Send_GMI_Statement_Mail,ALert_ID#" >> ReportDetails.txt
jobdetail=`autorep -j 2DWA_NEW_SendIRS_FTP`
echo "2,1,FTP client check in HEDGEPROD (Sybase),$jobdetail,FTP_CLIENT_ID#" >> ReportDetails.txt
jobdetail1=`autorep -j 2DWA_NEW_SendGMI_FTP`
echo "2,1,FTP client check in P2DWA (Oracle),$jobdetail1,FTP_CLIENT_ID#" >> ReportDetails.txt
echo "2,2,GMI FTP log ">> ReportDetails.txt
echo "2,2,IRS FTP log ">> ReportDetails.txt
echo "3,2,Log check for IOException" >> ReportDetails.txt
jobdetail2=`autorep -j 2DWA_NEW_GenerateConsolidatedStatement_DAILY`
echo "3,1,Custom FTP Files,$jobdetail2,Client_Mapping_Id#Client_File_Type_Id#Client_File_Path#Client_File_Name#OFC_ID#Is_FTP_EMAIL#FTP_EMail_Task_Id#Product_Type#" >> ReportDetails.txt
echo "3,2,Log check for Custom FTP" >> ReportDetails.txt

Run the java code here.

send mail

rm -f Custom_FTP_Files.txt FTP_client_check_in_HEDGEPROD_(Sybase).txt FTP_client_check_in_P2DWA_(Oracle).txt Futures_Daily_Statement_Call_Emails.txt Futures_Margin_Call_Emails.txt GMI_FTP_log.txt IRS_Daily_Statement_Call_Emails.txt IRS_FTP_log.txt IRS_Margin_Call_Emails.txt Log_check_for_Custom_FTP.txt Log_check_for_IOException.txt 