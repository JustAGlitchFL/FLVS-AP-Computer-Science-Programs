package M5.S1MC;

public class Message {

      private int idLength;
      private String deviceID;
      private int msgLength;
      private String textMsg;
 
      public Message(String msg){
            textMsg = msg;
      }
 
      public boolean isValid(){
            if (textMsg.charAt(2)== ' '){
                  idLength = Integer.parseInt(textMsg.substring(0,2));
                  if (textMsg.charAt(idLength+3)== ' '){
                        msgLength = Integer.parseInt(textMsg.substring(4+idLength,4+idLength+2));
                        if (textMsg.length() == 4+idLength+3+msgLength){
                              return true;
                        } else {
                              return false;
                        }
                  } else {
                        return false;
                  }
            } else {
                  return false;
            }
      }
 
      public int wordCount(){
            idLength = Integer.parseInt(textMsg.substring(0,2));
            deviceID = textMsg.substring(3,3+idLength);
            msgLength = Integer.parseInt(textMsg.substring(4+idLength,4+idLength+2));
            String messageText = textMsg.substring(4+idLength+3);
            int words = 0;
            for (int i = 0; i < messageText.length(); i++){
                  if (messageText.charAt(i) == ' '){
                        words++;
                  }
            }
            words++;
            return words;
      }
 
 }
 
 