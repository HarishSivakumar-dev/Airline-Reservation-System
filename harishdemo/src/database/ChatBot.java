package database;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.border.Border;

import java.lang.Override;
import java.lang.Thread;


import java.lang.Math;

public class ChatBot extends JFrame
{
    ChatBot()
    {
    	JFrame op=new JFrame();
    	op.setLayout(null);
    	op.setVisible(true);
    	op.setSize(6000,6000);

    	JLabel ch=new JLabel("AIRLINE CHAT BOT ");
    	ch.setFont(new Font("calibri",Font.ITALIC,20));
    	ch.setBounds(600,30,200,50);
    	op.add(ch);
    	
    	JTextArea ok=new JTextArea();
    	ok.setBounds(50,100,1180,400);
    	ok.setEditable(false);
    	op.add(ok);
    	
    	JScrollPane sp=new JScrollPane(ok);
    	sp.setBounds(50,100,1180,400);
    	op.add(sp);
    	
    	sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	
    	JButton ak=new JButton("Ask");
    	ak.setBounds(1100,580,70,30);
    	ak.setOpaque(false);
    	op.add(ak);
    	
    	JTextField cl=new JTextField();
    	cl.setBounds(50,550,1180,90);
    	op.add(cl);
    	
    	
    	
    	ak.addActionListener(new ActionListener ()
    			
    			{
    				public void actionPerformed(ActionEvent e)
    				{
    					String txt=cl.getText();
    					ok.append("\n"+"YOU: "+txt);
    					cl.setText("");
    					if(txt.equalsIgnoreCase("hi") || txt.equalsIgnoreCase("hello") || txt.equalsIgnoreCase("holla") || txt.equalsIgnoreCase("hey") || txt.equalsIgnoreCase("!"))
    					{
    						ok.append("\n"+"BOT: "+"hello sir");
    					}
    					else if(txt.equalsIgnoreCase("how are you ?") || txt.contains("how you doing"))
    					{
    						ok.append("\n"+"BOT: "+"iam fine sire");
    					}
    					else if(txt.equalsIgnoreCase("what do you do ?") || txt.equalsIgnoreCase("what do you know ?") || txt.equalsIgnoreCase("tell me something you know ?") || txt.equalsIgnoreCase("explain your activity") || txt.equalsIgnoreCase("what can you do ?"))
    					{
    						ok.append("\n"+"BOT: "+"Iam an Airline ChatBot. I have the capacity to answer only few questions that are listed below, as iam under developing stage. Feel Free to ask the questions listed below....");
    						ok.append("\n"+"\t"+"1. WHAT IS AN ONLINE AIRLINE BOOKING PLATFORM ?");
    						ok.append("\n"+"\t"+"2. WHAT ARE THE STEPS OF BOOKING FLIGHT TICKETS ONLINE ?");
    						ok.append("\n"+"\t"+"3. WHAT ARE THE BASIC RULES TO BE FOLLOWED WHILE BOOKING TICKETS ONLINE ?");
    						ok.append("\n"+"\t"+"4. WHAT ARE THE TERMS AND CONDITIONS OF OUR ARS ?");
    						ok.append("\n"+"\t"+"5. CAN AGENT/CUSTOMER RESHEDULE OR CANCEL THE BOOKING ONLINE FROM THE PORTAL ?");
    						ok.append("\n"+"\t"+"6. EXIT-------- To exit");
    					}
    					else if(txt.equalsIgnoreCase("WHAT IS AN ONLINE AIRLINE BOOKING PLATFORM ?"))
    					{
    						ok.append("\n"+"BOT:"+"An online airline booking platform is a digital service that allows users to search for, compare, and purchase airline tickets over the internet. These platforms typically offer features such as:\r\n"
    								+ "\r\n"
    								+ "Flight Search: Users can enter their travel details (like origin, destination, dates, and number of passengers) to find available flights.\r\n"
    								+ "\r\n"
    								+ "Price Comparison: The platform shows different flight options from various airlines, helping users compare prices and find the best deals.\r\n"
    								+ "\r\n"
    								+ "Booking and Payment: Once users select a flight, they can book it directly through the platform and make payments using various methods like credit/debit cards or digital wallets.\r\n"
    								+ "\r\n"
    								+ "Itinerary Management: Users can view and manage their booking details, including changing or canceling reservations.\r\n"
    								+ "\r\n"
    								+ "Additional Services: Many platforms also offer options to book hotels, car rentals, and travel insurance, providing a more comprehensive travel experience.");
    					}
    					else if(txt.equalsIgnoreCase("WHAT ARE THE STEPS OF BOOKING FLIGHT TICKETS ONLINE ?"))
    					{
    						ok.append("\n"+"BOT:"+"Booking a flight ticket online involves several steps. Here’s a straightforward guide to walk you through the process:\r\n"
    								+ "\r\n"
    								+ "1. Enter Travel Details\r\n"
    								+ "Search Form: Input your travel information into the search form. This typically includes:\r\n"
    								+ "Departure and Arrival Cities: Where you’re flying from and to.\r\n"
    								+ "Travel Dates: Departure and return dates (for round trips).\r\n"
    								+ "Number of Passengers: The number of adults, children, and infants.\r\n"
    								+ "Class of Service: Economy, Business, or First Class (if applicable).\r\n"
    								+ "2. Search for Flights\r\n"
    								+ "Click Book: Submit your details to generate a list of available flights.\r\n"
    								+ "3. Review and Compare Flight Options\r\n"
    								+ "Flight List: Browse through the search results, which will show flight times, durations, airlines, and prices.\r\n"
    								+ "4. Select a Flight\r\n"
    								+ "Choose a Flight: Click on the flight that best suits your needs to view more details.\r\n"
    								+ "Review Flight Details: Ensure the flight times, layovers (if any)\r\n"
    								+ "5. Enter Passenger Information\r\n"
    								+ "Passenger Details: Input the required information for each traveler, including:\r\n"
    								+ "Full Name: As it appears on the passport or ID.\r\n"
    								+ "Date of Birth: For age verification.\r\n"
    								+ "Contact Information: Email address and phone number.\r\n"
    								+ "Travel Documents: Passport details if international travel is involved.\r\n"
    								+ "7. Select Additional Services\r\n"
    								+ "Seat Selection: Choose your seats if the option is available.(WILL BE ADDED QUICKLY) \r\n"
    								+ "Special Requests: Indicate any special needs or preferences (e.g., meal requests).\r\n"
    								+ "8. Review and Confirm Booking\r\n"
    								+ "Check Details: Verify all booking details, including flight information, passenger details, and any additional services.\r\n"
    								+ "Edit if Necessary: Make any last-minute changes if needed.\r\n"
    								+ "9. Proceed to Payment\r\n"
    								+ "Payment Information: Enter your payment details (credit/debit card information or other payment methods).\r\n"
    								+ "Billing Information: Provide billing address details if required.\r\n"
    								+ "10. Complete the Booking\r\n"
    								+ "Submit Payment: Confirm and submit your payment to finalize the booking.\r\n"
    								+ "Confirmation: Wait for the confirmation screen or email that will include your booking reference number and e-ticket.\r\n"
    								+ "11. Receive Booking Confirmation\r\n"
    								+ "Confirmation Email: Check your email for a confirmation message with your booking details, e-ticket, and any important information about your flight.\r\n"
    								+ "Print or Save: Print your e-ticket or save it on your mobile device for easy access.");
    					}
    					else if(txt.equalsIgnoreCase("WHAT ARE THE BASIC RULES TO BE FOLLOWED WHILE BOOKING TICKETS ONLINE ?"))
    					{
    						ok.append("\n"+"BOT: "+"When booking tickets online, following certain basic rules can help ensure a smooth and hassle-free process. Here are some key guidelines to keep in mind:\r\n"
    								+ "\r\n"
    								+ "1. Double-Check Travel Dates and Details\r\n"
    								+ "Correct Dates: Ensure you enter the correct departure and return dates.\r\n"
    								+ "Accurate Information: Verify that all details (like destinations and passenger names) are accurate before confirming the booking.\r\n"
    								+ "2. Verify Passenger Information\r\n"
    								+ "Full Names: Use the exact names as they appear on the passports or IDs.\r\n"
    								+ "Date of Birth: Make sure to enter the correct birthdates, especially for children or infants.\r\n"
    								+ "3. Compare Prices and Options\r\n"
    								+ "Understand Fare Rules: Be aware of the terms and conditions associated with the fare, including cancellation and change policies.\r\n"
    								+ "4. Read Terms and Conditions\r\n"
    								+ "Refunds and Changes: Understand the rules regarding refunds, cancellations, and changes to your booking.\r\n"
    								+ "5. Check for Additional Fees\r\n"
    								+ "Hidden Charges: Be mindful of potential additional fees for services like seat selection, baggage, or payment processing.\r\n"
    								+ "Currency: Ensure you are aware of the currency being used for the transaction and any associated conversion fees.\r\n"
    								+ "6. Secure Your Payment Information\r\n"
    								+ "Safe Websites: Make sure the website or app you are using is secure (look for \"https://\" in the URL).\r\n"
    								+ "Payment Methods: Use secure and trusted payment methods. Avoid public or unsecured networks when entering payment information.\r\n"
    								+ "7. Review Booking Confirmation\r\n"
    								+ "Confirm Details: Once you receive the booking confirmation, verify that all details are correct.\r\n"
    								+ "Save Documentation: Keep a copy of your confirmation email and e-ticket for reference.\r\n"
    								+ "8. Understand Check-In Procedures\r\n"
    								+ "Check-In Timing: Familiarize yourself with the check-in process and deadlines for both online and airport check-in.\r\n"
    								+ "Travel Documents: Ensure you have the necessary travel documents ready, such as passports or visas, if applicable.\r\n"
    								+ "9. Be Aware of Airline Policies\r\n"
    								+ "Health and Safety: Follow any health and safety guidelines provided by the airline.\r\n"
    								+ "Travel Restrictions: Stay informed about travel restrictions or requirements for your destination, especially if traveling internationally.\r\n"
    								+ "10. Keep Contact Information Updated\r\n"
    								+ "Emergency Contact: Ensure your contact information is up-to-date so the airline or booking platform can reach you in case of changes or emergencies.\r\n"
    								+ "By adhering to these basic rules, you can minimize the risk of issues and make your online flight booking process as smooth as possible.\r\n"
    								+ "\r\n"
    								+ "\r\n"
    								+ "\r\n"
    								+ "");
    					}
    					else if(txt.equalsIgnoreCase("WHAT ARE THE TERMS AND CONDITIONS OF OUR ARS ?"))
    					{
    						ok.append("\n"+"BOT: "+"OUR terms and conditions for OUR airline reservation system encompass several important areas. While the specific details may vary and can be updated, here's an overview of the key components typically included:\r\n"
    								+ "\r\n"
    								+ "1. Booking and Payment:\r\n"
    								+ "Payment Methods: WE accept various payment methods including credit cards, debit cards, and sometimes alternative methods depending on your location.\r\n"
    								+ "Booking Confirmation: After booking, you'll receive a confirmation email with your ticket details. It's important to check this information and ensure it is correct.\r\n"
    								+ "2. Cancellation and Refund Policies:\r\n"
    								+ "Cancellation Terms: OUR policies may vary depending on the fare type. Generally, more flexible tickets allow cancellations with a refund, while lower-cost tickets might have stricter rules or no refunds.\r\n"
    								+ "Refunds: Refunds are processed based on the ticket type and fare conditions. Some tickets are non-refundable, and others may require a fee for processing.\r\n"
    								+ "3. Changes to Reservations:\r\n"
    								+ "Modification Fees: Fees and rules for changing your flight can vary. Typically, changes are allowed with a fee plus any difference in fare.\r\n"
    								+ "Availability: Changes are subject to availability and fare rules.\r\n"
    								+ "4. Check-In Procedures:\r\n"
    								+ "Timelines: Check-in usually starts 23 hours before departure for international flights and 36 hours for domestic flights. Online check-in is available.\r\n"
    								+ "Methods: You can check in online, via mobile app, or at the airport. Some services might have associated fees.\r\n"
    								+ "5. Passenger Responsibilities:\r\n"
    								+ "Identification: Passengers must present valid identification and travel documents as required by the destination country.\r\n"
    								+ "Behavior: Passengers must comply with airline policies and regulations regarding behavior and conduct.\r\n"
    								+ "7. Flight Changes and Cancellations:\r\n"
    								+ "Airline Rights: SWIFTWINGS reserves the right to change flight schedules, cancel flights, or deny boarding due to operational requirements or other reasons.\r\n"
    								+ "Compensation: Compensation policies for flight delays or cancellations are subject to EU regulations and SWIFTWINGS internal policies.\r\n"
    								+ "8. Liability and Limitations:\r\n"
    								+ "Liability Limits: Lufthansa’s liability for baggage loss, damage, or delay is limited according to international agreements such as the Montreal Convention.\r\n"
    								+ "Force Majeure: The airline is not liable for delays or cancellations caused by extraordinary events beyond its control.\r\n"
    								+ "9. Privacy and Data Protection:\r\n"
    								+ "Data Usage: SWIFTWINGS collects and processes personal data in accordance with GDPR and other relevant data protection laws. The airline uses this data for booking, customer service, and marketing purposes.\r\n"
    								+ "Third Parties: SWIFTWINGS may share information with third parties involved in the travel process, such as airport authorities and partners.\r\n"
    								+ "10. Governing Law and Dispute Resolution:\r\n"
    								+ "Jurisdiction: The terms and conditions are governed by INDIAN law.\r\n"
    								+ "Dispute Resolution: Disputes are generally handled according to the airline’s procedures or may involve legal action under INDIAN jurisdiction.");
    					}
    					else if(txt.equalsIgnoreCase("CAN AGENT/CUSTOMER RESHEDULE OR CANCEL THE BOOKING ONLINE FROM THE PORTAL ?"))
    					{
    						ok.append("\n"+"BOT: "+"Yes, SWIFTWINGS generally allows both agents and customers to reschedule or cancel bookings online through their portal. Here's how these processes typically work:\r\n"
    								+ "\r\n"
    								+ "1. Rescheduling a Booking:\r\n"
    								+ "Customer Portal: If you booked directly with SWIFTWINGS, you can manage your booking via the SWIFTWINGS website or mobile app. After logging in, you can access your reservation and view options for changing your flight. Changes can usually be made online, subject to availability and fare rules.\r\n"
    								+ "Travel Agents: If you booked through a travel agent, you would typically need to contact the agent to make changes. The agent can then handle the rescheduling on your behalf, although some agents might provide a link or access to manage your booking directly.\r\n"
    								+ "2. Canceling a Booking:\r\n"
    								+ "Customer Portal: You can cancel your booking online if your ticket allows it. The cancellation option is available under “MY BOOKINGS” on OUR website or app. Depending on the fare rules, there may be a cancellation fee or refund process outlined.\r\n"
    								+ "Travel Agents: For bookings made through a travel agent, you usually need to go through the agent to cancel your flight. The agent will process the cancellation and handle any related fees or refunds.\r\n"
    								+ "Important Considerations:\r\n"
    								+ "3. Fare Rules: The ability to change or cancel a booking online is subject to the fare conditions of your ticket. Some tickets, especially discounted ones, may have restrictions or fees associated with changes and cancellations.\r\n"
    								+ "Fees and Refunds: Online cancellations or changes may still incur fees as per the fare rules. Refunds are processed according to the type of ticket and the conditions of the booking.\r\n"
    								+ "Confirmation: After making changes or cancellations online, you should receive a confirmation email. Always verify the details to ensure everything is processed correctly.\r\n"
    								+ "For the most current and specific information, including any changes to the process or policies, it’s a good idea to check OUR official website or contact OUR customer service directly.\r\n"
    								+ "CUSTUMOR SERVICE TOLL FREE NUMBER:0427-9943388812 \r\n"
    								+ "\r\n"
    								+ "\r\n"
    								+ "\r\n"
    								+ "");
    					}
    					else if(txt.equalsIgnoreCase("EXIT"))
    					{
    						op.setVisible(false);
    						op.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    					}
    					else if(txt.equalsIgnoreCase("OKAY THANKYOU !") || txt.equalsIgnoreCase("thanks for sharing the information !") || txt.equalsIgnoreCase("THANKS FOR YOUR SERVICE !") || txt.equalsIgnoreCase("THANKS FOR RESPONDING !"))
    					{
    						ok.append("\n"+"BOT: "+"ITS OKAY SIR, THANKYOU. ITS MY PLEASURE. HAPPY TO HELP !");
    					}
    					else
    					{
    						ok.append("\n"+"BOT: "+"SORRY IAM UNDER DEVELOPMENT STAGE, I CAN'T UNDERSTAND YOUR ACCENT OF ENGLISH. \r\n"+"THE ADDITIONAL FEATURES(NLP) WILL BE ADDED SOON INTO OUR ARS. STAY CONNECTED !");
    						
    					}
    				}
    			}
    					
    			);
    	
    }
    public static void main(String [] args)
    
    {
    	ChatBot io=new ChatBot();
    }
    
    
}
        
