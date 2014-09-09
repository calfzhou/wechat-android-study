package com.tencent.mm.plugin.accountsync.model;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class AccountAuthenticatorService extends Service
{
  private static a dWE = null;

  public IBinder onBind(Intent paramIntent)
  {
    if (paramIntent == null);
    while ((paramIntent.getAction() == null) || (!paramIntent.getAction().equals("android.accounts.AccountAuthenticator")))
      return null;
    if (dWE == null)
      dWE = new a(this);
    return dWE.getIBinder();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.model.AccountAuthenticatorService
 * JD-Core Version:    0.6.2
 */