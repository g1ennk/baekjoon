class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(int i = 0; i < db.length; i++) {
            String dbId = db[i][0];
            String dbPw = db[i][1];
            
            if(id.equals(dbId) && pw.equals(dbPw)) {
                answer = "login";
            } else if(id.equals(dbId)) {
                answer = "wrong pw";
            } else if(!id.equals(dbId) && !pw.equals(dbPw)) {
                answer = "fail";
            }
        }
        
        return answer;
    }
}