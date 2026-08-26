package vn.edu.rikkei.session09.ex05;

public class Contact {

    public static final int PHONE_LENGTH = 10;

    private String contactId;
    private String contactName;
    private String phoneNumber;

    public Contact(
            String contactId,
            String contactName,
            String phoneNumber
    ) {
        this.contactId = contactId;
        this.contactName = contactName;
        setPhoneNumber(phoneNumber);
    }

    public void setPhoneNumber(String phone) {

        if (phone != null
                && phone.length() == PHONE_LENGTH
                && phone.startsWith("0")) {

            this.phoneNumber = phone;

        } else {

            System.out.println(
                    "[Cảnh báo SĐT] Số điện thoại '"
                            + phone
                            + "' không đúng "
                            + PHONE_LENGTH
                            + " số hoặc không bắt đầu bằng 0"
            );

            this.phoneNumber = "0000000000";
        }
    }

    public void displayContact() {
        System.out.println(
                "[" + contactId + "] "
                        + contactName
                        + " | SĐT: "
                        + phoneNumber
        );
    }

    public String getContactId() {
        return contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
