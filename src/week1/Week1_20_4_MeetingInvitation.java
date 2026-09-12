package week1;

/*
1.20.4 Meeting invitation
easy
|
30 min
|
Share
Help Google write google calendar meeting invitation functionality: Declare the following variables with the given values.

java
Copy code
____ inviter = "Steve Jobs";
____ invitee = "WeDevX Student";
____ topic = "Apple Pay Planning";

____ invitationEmail = ______;
System.out.println(invitationEmail);
initialize invitationEmail by concatenating the above value to build the following message: print out the value of invitationEmail.

plain
Copy code
Dear WeDevX Student,
Steve Jobs is inviting you to Apple Pay Planning meeting.
 */

public class Week1_20_4_MeetingInvitation {
    public static void main(String[] args) {
        String inviter = "Steve Jobs";
        String invitee = "WeDevX Student";
        String topic = "Apple Pay Planning";

        String invitationEmail = "Dear " + invitee + ",\n" + inviter + " is inviting you to " + topic + " meeting.";
        System.out.println(invitationEmail);
    }
}
