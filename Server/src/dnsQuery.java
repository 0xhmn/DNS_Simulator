import java.net.Socket;

/*
 * Class dnsQuery handles new incoming queries.
 */

class dnsQuery extends Thread {
    Socket sSock = null;
    dnsQuery(Socket sSock) {
        this.sSock = sSock;
    }
    @Override
    public void run(){
        try{
            //Create an output stream and an input stream.
            //set input and output streams to correspond with the server socket.
            //Read in DNS Request
            //test for "hangup" signal and close the socket and in/out streams if it is found.

            try{
                //set local file cache to predetermined file.(e.g. DNS_mapping.txt)
                //create file if it doesn't exist
                //if it does exist, read the file line by line to look for a
                //match with the query sent from the client
                //If no lines match, use the machine DNS loockup to find the IP address
                //send the result in the right format to the client
            } catch (Exception e) {
                //If no host was found, send out "Host Not Found" to the client
            }
        } catch(Exception e){
        }
    }
    //print response to the terminal
    //send the response back to the client
    //Close the server socket.

}
