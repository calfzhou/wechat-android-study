package com.tencent.mm.plugin.accountsync.model;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.accountsync.ui.ContactsSyncUI;
import com.tencent.mm.sdk.platformtools.z;

final class a extends AbstractAccountAuthenticator
{
  private Context mContext;

  public a(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public final Bundle addAccount(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString1, String paramString2, String[] paramArrayOfString, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    Intent localIntent = new Intent(this.mContext, ContactsSyncUI.class);
    localIntent.putExtra("accountAuthenticatorResponse", paramAccountAuthenticatorResponse);
    localIntent.putExtra("contact_sync_scene", 1);
    localBundle.putParcelable("intent", localIntent);
    return localBundle;
  }

  public final Bundle confirmCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, Bundle paramBundle)
  {
    z.i("!56@/B4Tb64lLpIaKqQrIg/z8GkVquS3edhX8D5+aGLT9JA8DpSq5rbbyw==", "confirmCredentials");
    return null;
  }

  public final Bundle editProperties(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, String paramString)
  {
    z.i("!56@/B4Tb64lLpIaKqQrIg/z8GkVquS3edhX8D5+aGLT9JA8DpSq5rbbyw==", "editProperties");
    return null;
  }

  public final Bundle getAuthToken(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    z.i("!56@/B4Tb64lLpIaKqQrIg/z8GkVquS3edhX8D5+aGLT9JA8DpSq5rbbyw==", "getAuthToken");
    return null;
  }

  public final String getAuthTokenLabel(String paramString)
  {
    z.i("!56@/B4Tb64lLpIaKqQrIg/z8GkVquS3edhX8D5+aGLT9JA8DpSq5rbbyw==", "getAuthTokenLabel");
    return null;
  }

  public final Bundle hasFeatures(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String[] paramArrayOfString)
  {
    z.i("!56@/B4Tb64lLpIaKqQrIg/z8GkVquS3edhX8D5+aGLT9JA8DpSq5rbbyw==", "hasFeatures: " + paramArrayOfString);
    return null;
  }

  public final Bundle updateCredentials(AccountAuthenticatorResponse paramAccountAuthenticatorResponse, Account paramAccount, String paramString, Bundle paramBundle)
  {
    z.i("!56@/B4Tb64lLpIaKqQrIg/z8GkVquS3edhX8D5+aGLT9JA8DpSq5rbbyw==", "updateCredentials");
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.model.a
 * JD-Core Version:    0.6.2
 */