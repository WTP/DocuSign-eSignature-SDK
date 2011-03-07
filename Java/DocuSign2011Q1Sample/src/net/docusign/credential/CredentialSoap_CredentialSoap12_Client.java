
package net.docusign.credential;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.2
 * 2011-03-04T13:09:32.930-08:00
 * Generated source version: 2.3.2
 * 
 */
public final class CredentialSoap_CredentialSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.docusign.net/API/Credential", "Credential");

    private CredentialSoap_CredentialSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Credential.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Credential ss = new Credential(wsdlURL, SERVICE_NAME);
        CredentialSoap port = ss.getCredentialSoap12();  
        
        {
        System.out.println("Invoking ping...");
        boolean _ping__return = port.ping();
        System.out.println("ping.result=" + _ping__return);


        }
        {
        System.out.println("Invoking requestSenderToken...");
        java.lang.String _requestSenderToken_email = "_requestSenderToken_email-645670386";
        java.lang.String _requestSenderToken_password = "_requestSenderToken_password-1272254720";
        java.lang.String _requestSenderToken_accountID = "_requestSenderToken_accountID-2116002201";
        java.lang.String _requestSenderToken_envelopeID = "_requestSenderToken_envelopeID1110076227";
        java.lang.String _requestSenderToken_returnURL = "_requestSenderToken_returnURL-1805058278";
        java.lang.String _requestSenderToken__return = port.requestSenderToken(_requestSenderToken_email, _requestSenderToken_password, _requestSenderToken_accountID, _requestSenderToken_envelopeID, _requestSenderToken_returnURL);
        System.out.println("requestSenderToken.result=" + _requestSenderToken__return);


        }
        {
        System.out.println("Invoking login...");
        java.lang.String _login_email = "_login_email977090702";
        java.lang.String _login_password = "_login_password1683463695";
        net.docusign.credential.LoginResponse.LoginResult _login__return = port.login(_login_email, _login_password);
        System.out.println("login.result=" + _login__return);


        }
        {
        System.out.println("Invoking getAuthenticationToken...");
        java.lang.String _getAuthenticationToken_email = "_getAuthenticationToken_email807158744";
        java.lang.String _getAuthenticationToken_password = "_getAuthenticationToken_password1743554631";
        java.lang.String _getAuthenticationToken_accountID = "_getAuthenticationToken_accountID651186754";
        java.lang.String _getAuthenticationToken_goToEnvelopeID = "_getAuthenticationToken_goToEnvelopeID1467524170";
        java.lang.String _getAuthenticationToken__return = port.getAuthenticationToken(_getAuthenticationToken_email, _getAuthenticationToken_password, _getAuthenticationToken_accountID, _getAuthenticationToken_goToEnvelopeID);
        System.out.println("getAuthenticationToken.result=" + _getAuthenticationToken__return);


        }
        {
        System.out.println("Invoking requestCorrectToken...");
        java.lang.String _requestCorrectToken_email = "_requestCorrectToken_email-476249259";
        java.lang.String _requestCorrectToken_password = "_requestCorrectToken_password-2094631098";
        java.lang.String _requestCorrectToken_envelopeID = "_requestCorrectToken_envelopeID-514388041";
        boolean _requestCorrectToken_suppressNavigation = false;
        java.lang.String _requestCorrectToken_returnURL = "_requestCorrectToken_returnURL24317819";
        java.lang.String _requestCorrectToken__return = port.requestCorrectToken(_requestCorrectToken_email, _requestCorrectToken_password, _requestCorrectToken_envelopeID, _requestCorrectToken_suppressNavigation, _requestCorrectToken_returnURL);
        System.out.println("requestCorrectToken.result=" + _requestCorrectToken__return);


        }

        System.exit(0);
    }

}
