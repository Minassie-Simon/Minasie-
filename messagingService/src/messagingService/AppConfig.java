package messagingService;


public class AppConfig {
    
    public MessagingService emailMessagingService() {
        return new EmailMessagingService();
    }
    
  
    public MessagingService smsMessagingService() {
        return new SmsMessagingService();
    }
    
   
    public MesssagingApp messagingApp(MessagingService messagingService) {
        return new MesssagingApp(messagingService);
    }
}