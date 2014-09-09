package android.content.pm;

import android.os.IBinder;
import android.os.Parcel;

class IPackageStatsObserver$Stub$Proxy
  implements IPackageStatsObserver
{
  private IBinder mRemote;

  IPackageStatsObserver$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public IBinder asBinder()
  {
    return this.mRemote;
  }

  public String getInterfaceDescriptor()
  {
    return "IPackageStatsObserver";
  }

  public void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    while (true)
    {
      try
      {
        localParcel.writeInterfaceToken("IPackageStatsObserver");
        if (paramPackageStats != null)
        {
          localParcel.writeInt(1);
          paramPackageStats.writeToParcel(localParcel, 0);
          break label85;
          localParcel.writeInt(i);
          this.mRemote.transact(1, localParcel, null, 1);
        }
        else
        {
          localParcel.writeInt(0);
        }
      }
      finally
      {
        localParcel.recycle();
      }
      label85: 
      while (!paramBoolean)
      {
        i = 0;
        break;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.content.pm.IPackageStatsObserver.Stub.Proxy
 * JD-Core Version:    0.6.2
 */