package cafemanagement;

import cafemanagement.server.AuthServer;
import cafemanagement.client.AuthClient;

public class MainApplication {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify 'server' or 'client' as an argument.");
            return;
        }

        switch (args[0].toLowerCase()) {
            case "server":
                AuthServer.main(args);
                break;
            case "client":
                AuthClient.main(args);
                break;
            default:
                System.out.println("Unknown argument. Please specify 'server' or 'client'.");
                break;
        }
    }
}
