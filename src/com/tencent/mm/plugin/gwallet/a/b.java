package com.tencent.mm.plugin.gwallet.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.a.a.a;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private a fdA;
  private ServiceConnection fdB;
  private boolean fdC = false;
  boolean fdD = false;
  int fdE;
  private i fdF;
  private String fdG;
  private Context mContext;

  public b(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private static int c(Bundle paramBundle)
  {
    Object localObject = paramBundle.get("RESPONSE_CODE");
    if (localObject == null)
    {
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Bundle with null response code, assuming OK (known issue)");
      return 0;
    }
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    if ((localObject instanceof Long))
      return (int)((Long)localObject).longValue();
    nz("Unexpected type for bundle response code.");
    nz(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for bundle response code: " + localObject.getClass().getName());
  }

  public static String hV(int paramInt)
  {
    String[] arrayOfString1 = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
    String[] arrayOfString2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
    if (paramInt <= -1000)
    {
      int i = -1000 - paramInt;
      if ((i >= 0) && (i < arrayOfString2.length))
        return arrayOfString2[i];
      return String.valueOf(paramInt) + ":Unknown IAB Helper Error";
    }
    if ((paramInt < 0) || (paramInt >= arrayOfString1.length))
      return String.valueOf(paramInt) + ":Unknown";
    return arrayOfString1[paramInt];
  }

  private void ny(String paramString)
  {
    if (!this.fdC)
    {
      z.e("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Illegal state for operation (" + paramString + "): IAB helper is not set up.");
      throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + paramString);
    }
  }

  private static void nz(String paramString)
  {
    z.e("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "In-app billing error: " + paramString);
  }

  public final void a(Activity paramActivity, String paramString1, String paramString2, i parami, String paramString3)
  {
    ny("launchPurchaseFlow");
    if ((paramString2.equals("subs")) && (!this.fdD))
    {
      parami.b(new k(-1009, "Subscriptions are not available."), null);
      return;
    }
    try
    {
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Constructing buy intent for " + paramString1 + ", item type: " + paramString2 + ", extraData: " + paramString3);
      localBundle = this.fdA.a(3, this.mContext.getPackageName(), paramString1, paramString2, paramString3);
      int i = c(localBundle);
      if (i != 0)
      {
        parami.b(new k(i, "Unable to buy item"), null);
        return;
      }
    }
    catch (IntentSender.SendIntentException localSendIntentException)
    {
      Bundle localBundle;
      nz("SendIntentException while launching purchase flow for sku " + paramString1);
      parami.b(new k(-1004, "Failed to send intent."), null);
      return;
      PendingIntent localPendingIntent = (PendingIntent)localBundle.getParcelable("BUY_INTENT");
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Launching buy intent for " + paramString1 + ". Request code: 10001");
      this.fdE = 10001;
      this.fdF = parami;
      this.fdG = paramString2;
      paramActivity.startIntentSenderForResult(localPendingIntent.getIntentSender(), 10001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
      return;
    }
    catch (RemoteException localRemoteException)
    {
      nz("RemoteException while launching purchase flow for sku " + paramString1);
      parami.b(new k(-1001, "Remote exception while starting purchase flow"), null);
    }
  }

  public final void a(h paramh)
  {
    if (this.fdC)
      throw new IllegalStateException("IAB helper is already set up.");
    z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Starting in-app billing setup.");
    this.fdB = new c(this, paramh);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    if (!this.mContext.getPackageManager().queryIntentServices(localIntent, 0).isEmpty())
    {
      this.mContext.bindService(localIntent, this.fdB, 1);
      return;
    }
    paramh.a(new k(-2001, "Google play not installed!"));
  }

  public final void a(String paramString, i parami)
  {
    cm localcm = new cm();
    ny("queryInventory");
    new Thread(new f(this, paramString, localcm, parami)).start();
  }

  public final void a(List paramList, i parami)
  {
    new Thread(new d(this, paramList, parami, new cm())).start();
  }

  public final boolean a(int paramInt, Intent paramIntent)
  {
    if (paramInt != this.fdE)
      return false;
    ny("handleActivityResult");
    if (paramIntent == null)
    {
      nz("Null data in IAB activity result.");
      k localk2 = new k(-1002, "Null data in IAB result");
      if (this.fdF != null)
        this.fdF.b(localk2, null);
      return true;
    }
    Object localObject = paramIntent.getExtras().get("RESPONSE_CODE");
    int i;
    if (localObject == null)
    {
      nz("Intent with no response code, assuming OK (known issue)");
      i = 0;
    }
    while (true)
    {
      String str1 = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
      String str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Purchase data: " + str1);
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Data signature: " + str2);
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Extras: " + paramIntent.getExtras());
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Expected item type: " + this.fdG);
      k localk1 = new k(i, "Null data in IAB result");
      if (this.fdF != null)
        this.fdF.b(localk1, paramIntent);
      return true;
      if ((localObject instanceof Integer))
      {
        i = ((Integer)localObject).intValue();
      }
      else
      {
        if (!(localObject instanceof Long))
          break;
        i = (int)((Long)localObject).longValue();
      }
    }
    nz("Unexpected type for intent response code.");
    nz(localObject.getClass().getName());
    throw new RuntimeException("Unexpected type for intent response code: " + localObject.getClass().getName());
  }

  public final boolean a(ArrayList paramArrayList, j paramj)
  {
    ny("query details");
    Intent localIntent = new Intent();
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      z.e("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "query list is empty!");
      k localk1 = new k(5, "no query list or is empty");
      localIntent.putExtra("RESPONSE_CODE", 5);
      localIntent.putExtra("QUERY_DETAIL_INFO", new ArrayList());
      paramj.a(localk1, localIntent);
      return true;
    }
    try
    {
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "query detail list with the size is " + paramArrayList.size());
      Bundle localBundle1 = new Bundle();
      localBundle1.putStringArrayList("ITEM_ID_LIST", paramArrayList);
      Bundle localBundle2 = this.fdA.a(3, this.mContext.getPackageName(), "inapp", localBundle1);
      int i = c(localBundle2);
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "detail response: " + String.valueOf(i));
      if (i != 0)
      {
        z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "cannot query details");
        k localk3 = new k(i, "cannot query details");
        localIntent.putExtra("RESPONSE_CODE", i);
        paramj.a(localk3, localIntent);
        return true;
      }
      k localk4 = new k(i, "query list ok!");
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "result code : " + i);
      localIntent.putExtra("RESPONSE_CODE", i);
      localIntent.putExtra("RESPONSE_QUERY_DETAIL_INFO", localBundle2.getStringArrayList("DETAILS_LIST"));
      paramj.a(localk4, localIntent);
      Iterator localIterator = localBundle2.getStringArrayList("DETAILS_LIST").iterator();
      while (localIterator.hasNext())
        z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", (String)localIterator.next());
    }
    catch (RemoteException localRemoteException)
    {
      nz("RemoteException while launching query details ");
      k localk2 = new k(-1001, "Remote exception while starting purchase flow");
      localIntent.putExtra("RESPONSE_CODE", 6);
      localIntent.putExtra("QUERY_DETAIL_INFO", new ArrayList());
      paramj.a(localk2, localIntent);
      return false;
    }
    return true;
  }

  public final void dispose()
  {
    z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Disposing.");
    this.fdC = false;
    if (this.fdB != null)
      z.d("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", "Unbinding from service.");
    try
    {
      if (this.mContext != null)
        this.mContext.unbindService(this.fdB);
      this.fdB = null;
      this.fdA = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        z.e("!32@/B4Tb64lLpKw9oSUpbeF6PlG5rCG0j68", localIllegalArgumentException.toString());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.b
 * JD-Core Version:    0.6.2
 */