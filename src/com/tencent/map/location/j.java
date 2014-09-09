package com.tencent.map.location;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import java.util.LinkedList;
import java.util.List;

public final class j
{
  private Context LB = null;
  private TelephonyManager LD = null;
  private l LE = null;
  private n LF = null;
  private m LG = null;
  private byte[] LH = new byte[0];
  private byte[] LI = new byte[0];
  private boolean LJ = false;
  private boolean Lw = false;
  private List a = new LinkedList();

  private int aS(int paramInt)
  {
    String str = this.LD.getNetworkOperator();
    if ((str != null) && (str.length() >= 3));
    int i;
    while (true)
    {
      try
      {
        int j = Integer.valueOf(str.substring(0, 3)).intValue();
        i = j;
        if ((paramInt != 2) || (i != -1))
          break;
        return 0;
      }
      catch (Exception localException)
      {
      }
      i = -1;
    }
    return i;
  }

  public final void a()
  {
    synchronized (this.LH)
    {
      if (!this.Lw)
        return;
      if (this.LD != null)
      {
        l locall = this.LE;
        if (locall == null);
      }
    }
    try
    {
      this.LD.listen(this.LE, 0);
      this.Lw = false;
      return;
      localObject = finally;
      throw localObject;
    }
    catch (Exception localException)
    {
      while (true)
        this.Lw = false;
    }
  }

  public final boolean a(Context paramContext, n paramn)
  {
    synchronized (this.LH)
    {
      if (this.Lw)
        return true;
      if ((paramContext == null) || (paramn == null))
        return false;
      this.LB = paramContext;
      this.LF = paramn;
      try
      {
        this.LD = ((TelephonyManager)this.LB.getSystemService("phone"));
        TelephonyManager localTelephonyManager = this.LD;
        if (localTelephonyManager == null)
          return false;
        int i = this.LD.getPhoneType();
        this.LE = new l(this, aS(i), i);
        l locall = this.LE;
        if (locall == null)
          return false;
        CellLocation localCellLocation = this.LD.getCellLocation();
        if (localCellLocation != null)
          this.LE.onCellLocationChanged(localCellLocation);
        this.LD.listen(this.LE, 18);
        this.Lw = true;
        return this.Lw;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
  }

  public final List gY()
  {
    synchronized (this.LI)
    {
      List localList = this.a;
      LinkedList localLinkedList = null;
      if (localList != null)
      {
        localLinkedList = new LinkedList();
        localLinkedList.addAll(this.a);
      }
      return localLinkedList;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.j
 * JD-Core Version:    0.6.2
 */