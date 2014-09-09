package com.tencent.map.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g$a extends BroadcastReceiver
{
  private boolean Lw = false;
  private int jdField_a_of_type_Int = 4;
  private List jdField_a_of_type_JavaUtilList = null;

  public g$a(g paramg)
  {
  }

  private void b(List paramList)
  {
    if (paramList == null)
      return;
    if (this.Lw)
    {
      if (this.jdField_a_of_type_JavaUtilList == null)
        this.jdField_a_of_type_JavaUtilList = new ArrayList();
      int i = this.jdField_a_of_type_JavaUtilList.size();
      Iterator localIterator2 = paramList.iterator();
      label49: ScanResult localScanResult2;
      if (localIterator2.hasNext())
        localScanResult2 = (ScanResult)localIterator2.next();
      for (int j = 0; ; j++)
        if (j < i)
        {
          if (((ScanResult)this.jdField_a_of_type_JavaUtilList.get(j)).BSSID.equals(localScanResult2.BSSID))
            this.jdField_a_of_type_JavaUtilList.remove(j);
        }
        else
        {
          this.jdField_a_of_type_JavaUtilList.add(localScanResult2);
          break label49;
          break;
        }
    }
    if (this.jdField_a_of_type_JavaUtilList == null)
      this.jdField_a_of_type_JavaUtilList = new ArrayList();
    while (true)
    {
      Iterator localIterator1 = paramList.iterator();
      while (localIterator1.hasNext())
      {
        ScanResult localScanResult1 = (ScanResult)localIterator1.next();
        this.jdField_a_of_type_JavaUtilList.add(localScanResult1);
      }
      break;
      this.jdField_a_of_type_JavaUtilList.clear();
    }
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    String str;
    List localList1;
    do
    {
      do
      {
        do
        {
          return;
          str = paramIntent.getAction();
        }
        while (str == null);
        if (str.equals("android.net.wifi.WIFI_STATE_CHANGED"))
        {
          this.jdField_a_of_type_Int = paramIntent.getIntExtra("wifi_state", 4);
          if (g.b(this.LZ) != null)
            g.b(this.LZ).aU(this.jdField_a_of_type_Int);
        }
      }
      while ((!str.equals("android.net.wifi.SCAN_RESULTS")) && (!str.equals("android.net.wifi.WIFI_STATE_CHANGED")));
      WifiManager localWifiManager = g.c(this.LZ);
      localList1 = null;
      if (localWifiManager != null)
        localList1 = g.c(this.LZ).getScanResults();
    }
    while ((str.equals("android.net.wifi.WIFI_STATE_CHANGED")) && ((localList1 == null) || ((localList1 != null) && (localList1.size() == 0))));
    if ((!this.Lw) && (this.jdField_a_of_type_JavaUtilList != null) && (this.jdField_a_of_type_JavaUtilList.size() >= 4) && (localList1 != null) && (localList1.size() <= 2))
    {
      b(localList1);
      this.Lw = true;
      this.LZ.f(0L);
      return;
    }
    b(localList1);
    this.Lw = false;
    g localg = this.LZ;
    List localList2 = this.jdField_a_of_type_JavaUtilList;
    System.currentTimeMillis();
    g.a(localg, new z(localList2));
    if (g.b(this.LZ) != null)
      g.b(this.LZ).a(g.d(this.LZ));
    this.LZ.f(20000L * g.e(this.LZ));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.g.a
 * JD-Core Version:    0.6.2
 */