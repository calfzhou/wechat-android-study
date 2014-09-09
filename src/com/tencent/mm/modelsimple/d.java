package com.tencent.mm.modelsimple;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;

public final class d
{
  private final String TAG = "!32@/B4Tb64lLpKVM3BoHNnBHzbUE4f2XdPA";
  private final ContentResolver dCe;
  ArrayList dCf;

  public d(c paramc, ContentResolver paramContentResolver)
  {
    this.dCe = paramContentResolver;
    this.dCf = new ArrayList();
  }

  public final void a(ContentProviderOperation paramContentProviderOperation)
  {
    this.dCf.add(paramContentProviderOperation);
  }

  public final void execute()
  {
    if (this.dCf.size() == 0)
    {
      z.d("!32@/B4Tb64lLpKVM3BoHNnBHzbUE4f2XdPA", "no batch operation");
      return;
    }
    try
    {
      this.dCe.applyBatch("com.android.contacts", this.dCf);
      this.dCf.clear();
      return;
    }
    catch (OperationApplicationException localOperationApplicationException)
    {
      while (true)
      {
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = localOperationApplicationException.toString();
        z.e("!32@/B4Tb64lLpKVM3BoHNnBHzbUE4f2XdPA", "apply batch operation failed", arrayOfObject3);
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = localRemoteException.toString();
        z.e("!32@/B4Tb64lLpKVM3BoHNnBHzbUE4f2XdPA", "apply batch operation failed", arrayOfObject2);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.toString();
        z.e("!32@/B4Tb64lLpKVM3BoHNnBHzbUE4f2XdPA", "apply batch operation failed", arrayOfObject1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.d
 * JD-Core Version:    0.6.2
 */