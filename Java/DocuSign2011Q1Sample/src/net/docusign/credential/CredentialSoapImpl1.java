
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.docusign.credential;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.2
 * 2011-03-04T13:09:32.977-08:00
 * Generated source version: 2.3.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "Credential",
                      portName = "CredentialSoap12",
                      targetNamespace = "http://www.docusign.net/API/Credential",
                      wsdlLocation = "https://www.docusign.net/api/3.0/credential.asmx?wsdl",
                      endpointInterface = "net.docusign.credential.CredentialSoap")
                      
public class CredentialSoapImpl1 implements CredentialSoap {

    private static final Logger LOG = Logger.getLogger(CredentialSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see net.docusign.credential.CredentialSoap#ping(*
     */
    public boolean ping() { 
        LOG.info("Executing operation ping");
        try {
            boolean _return = false;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.credential.CredentialSoap#requestSenderToken(java.lang.String  email ,)java.lang.String  password ,)java.lang.String  accountID ,)java.lang.String  envelopeID ,)java.lang.String  returnURL )*
     */
    public java.lang.String requestSenderToken(java.lang.String email,java.lang.String password,java.lang.String accountID,java.lang.String envelopeID,java.lang.String returnURL) { 
        LOG.info("Executing operation requestSenderToken");
        System.out.println(email);
        System.out.println(password);
        System.out.println(accountID);
        System.out.println(envelopeID);
        System.out.println(returnURL);
        try {
            java.lang.String _return = "_return-1384154843";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.credential.CredentialSoap#login(java.lang.String  email ,)java.lang.String  password )*
     */
    public net.docusign.credential.LoginResponse.LoginResult login(java.lang.String email,java.lang.String password) { 
        LOG.info("Executing operation login");
        System.out.println(email);
        System.out.println(password);
        try {
            net.docusign.credential.LoginResponse.LoginResult _return = new net.docusign.credential.LoginResponse.LoginResult();
            _return.setSuccess(false);
            net.docusign.credential.ErrorCode _returnErrorCode = net.docusign.credential.ErrorCode.USER_LACKS_PERMISSIONS;
            _return.setErrorCode(_returnErrorCode);
            _return.setAuthenticationMessage("AuthenticationMessage918958034");
            net.docusign.credential.ArrayOfAccount _returnAccounts = new net.docusign.credential.ArrayOfAccount();
            java.util.List<net.docusign.credential.ArrayOfAccount.Account> _returnAccountsAccount = new java.util.ArrayList<net.docusign.credential.ArrayOfAccount.Account>();
            net.docusign.credential.ArrayOfAccount.Account _returnAccountsAccountVal1 = new net.docusign.credential.ArrayOfAccount.Account();
            _returnAccountsAccountVal1.setAccountID("AccountID-479613540");
            _returnAccountsAccountVal1.setAccountName("AccountName-1016017474");
            _returnAccountsAccountVal1.setUserID("UserID2066751586");
            _returnAccountsAccountVal1.setUserName("UserName666964457");
            _returnAccountsAccountVal1.setEmail("Email490406670");
            _returnAccountsAccount.add(_returnAccountsAccountVal1);
            _returnAccounts.getAccount().addAll(_returnAccountsAccount);
            _return.setAccounts(_returnAccounts);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.credential.CredentialSoap#getAuthenticationToken(java.lang.String  email ,)java.lang.String  password ,)java.lang.String  accountID ,)java.lang.String  goToEnvelopeID )*
     */
    public java.lang.String getAuthenticationToken(java.lang.String email,java.lang.String password,java.lang.String accountID,java.lang.String goToEnvelopeID) { 
        LOG.info("Executing operation getAuthenticationToken");
        System.out.println(email);
        System.out.println(password);
        System.out.println(accountID);
        System.out.println(goToEnvelopeID);
        try {
            java.lang.String _return = "_return-1221408955";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.docusign.credential.CredentialSoap#requestCorrectToken(java.lang.String  email ,)java.lang.String  password ,)java.lang.String  envelopeID ,)boolean  suppressNavigation ,)java.lang.String  returnURL )*
     */
    public java.lang.String requestCorrectToken(java.lang.String email,java.lang.String password,java.lang.String envelopeID,boolean suppressNavigation,java.lang.String returnURL) { 
        LOG.info("Executing operation requestCorrectToken");
        System.out.println(email);
        System.out.println(password);
        System.out.println(envelopeID);
        System.out.println(suppressNavigation);
        System.out.println(returnURL);
        try {
            java.lang.String _return = "_return1736408655";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
