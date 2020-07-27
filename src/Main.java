import com.bhuman.exm.api.APIFactory;
import com.bhuman.exm.api.SageImpl;
import com.bhuman.exm.models.Credentials;
import com.bhuman.exm.models.JournalEntry;
import com.bhuman.exm.util.Constants;
import com.bhuman.exm.util.SageEndpoint;

public class Main {

	public static void main(String[] args) throws Exception {

		SageImpl sageAuth = (SageImpl) APIFactory.factory.getAuthAPI(Constants.sageFactoryKey);

		SageImpl crudImpl = (SageImpl) APIFactory.factory.getCrudAPI(Constants.sageFactoryKey);

		Credentials cred = sageAuth.authenticate();
		
		String urlStr = SageEndpoint.POST_JOURNAL_ENTRY.urlString();
		JournalEntry entry = new JournalEntry();
		try {
			crudImpl.create(entry, cred.getSessionId());
		} catch (Exception ex) {
			throw new Exception("Error creating the journal entry");
		}
		// do stuff
	}
}
