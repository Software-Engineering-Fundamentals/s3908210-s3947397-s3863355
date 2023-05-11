import java.util.ArrayList;

public class Enquiry {
    String generalEnquiry;
    String ITIssue;
    String trackingID;
    String type;
    String reply;
    static ArrayList<Enquiry> enquiryList = new ArrayList<>();

    public Enquiry(String type, String message) {

        this.type = type;
        // save message based on type
        if (type == "general") {
            this.generalEnquiry = message;
        } else if (type == "it") {
            this.ITIssue = message;
        }

        // allocate unique ID to enquiry
        this.setTrackingID(type + "0001");
        enquiryList.add(this);

    }

    // setters and getters

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getGeneralEnquiry() {
        return generalEnquiry;
    }

    public void setGeneralEnquiry(String generalEnquiry) {
        this.generalEnquiry = generalEnquiry;
    }

    public String getITIssue() {
        return ITIssue;
    }

    public void setITIssue(String iTIssue) {
        ITIssue = iTIssue;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<Enquiry> getEnquiryList() {
        return enquiryList;
    }

    public static void setEnquiryList(ArrayList<Enquiry> enquiryList) {
        Enquiry.enquiryList = enquiryList;
    }
}
