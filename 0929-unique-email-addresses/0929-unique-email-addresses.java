class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];
            
            // Handle '+'
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            
            // Remove '.'
            local = local.replace(".", "");
            
            // Add normalized email to set
            uniqueEmails.add(local + "@" + domain);
        }
        
        return uniqueEmails.size();
    }
}
