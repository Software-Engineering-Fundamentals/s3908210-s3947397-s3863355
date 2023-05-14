import java.util.ArrayList;

public class Enquiry {
    private String generalEnquiry;
    private String ITIssue;
    private String trackingID;
    private String type;
    private String reply;

    // to keep track of all enquiries for purpose of this skeleton code.
    // will not add this as an attribute of Enquiry class in final model.
    static ArrayList<Enquiry> enquiryList = new ArrayList<>();

    public Enquiry(String type, String message) {

        this.type = type;

        // allocate dummyunique ID to enquiry
        this.setTrackingID(type + "0001");

        // save message based on type
        if (type == "general") {
            this.generalEnquiry = message;
        } else if (type == "it") {
            this.ITIssue = message;
        }

        enquiryList.add(this);

    }

    public String viewEnquiry() {

        // this method would return details of the enquiry.
        return "enquiry details";
    }

    public void notifyResponse() {

        // notifies user of the response based on tracking ID
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
