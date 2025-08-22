class Solution {
    public int numUniqueEmails(String[] emails) {
        Set <String> ss = new HashSet<>();

        for(String email:emails){
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            int indexOfplus = local.indexOf("+");

            if(indexOfplus != -1){
                local = local.substring(0,indexOfplus);
            } 
            local=local.replace(".","");
            String mail = local + "@" + domain;
            ss.add(mail);
        }
        return ss.size();
    }
}