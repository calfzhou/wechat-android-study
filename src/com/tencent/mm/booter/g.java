package com.tencent.mm.booter;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cr;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.xlog.LogLogicJni;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.HashMap;

public final class g
{
  public int dhH = -1;
  private final String[] dhI = { "_id", "key", "type", "value" };
  private final HashMap dhJ = new HashMap();
  private Context dhK;

  public g(Context paramContext)
  {
    this.dhK = paramContext;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    try
    {
      Cursor localCursor2 = localContentResolver.query(com.tencent.mm.i.b.CONTENT_URI, this.dhI, null, null, null);
      localCursor1 = localCursor2;
      if (localCursor1 == null)
        return;
    }
    catch (Exception localException)
    {
      Cursor localCursor1;
      while (true)
        localCursor1 = null;
      if (localCursor1.getCount() <= 0)
      {
        localCursor1.close();
        return;
      }
      if (!"18c867f0717aa67b2ab7347505ba07ed".equals(ch.i("com.tencent.mm.coolassist", paramContext)))
      {
        localCursor1.close();
        return;
      }
      com.tencent.mm.sdk.b.b.aMZ();
      int i = localCursor1.getColumnIndex("key");
      int j = localCursor1.getColumnIndex("type");
      int k = localCursor1.getColumnIndex("value");
      while (localCursor1.moveToNext())
      {
        Object localObject = h.c(localCursor1.getInt(j), localCursor1.getString(k));
        this.dhJ.put(localCursor1.getString(i), localObject);
      }
      localCursor1.close();
    }
  }

  private void bS(String paramString)
  {
    boolean bool1 = true;
    Integer localInteger = getInteger(".com.tencent.mm.debug.log.level");
    boolean bool2 = ch.a(bT(".com.tencent.mm.debug.log.append_mode"), false);
    z.nQ(ch.a(localInteger, 2));
    boolean bool3;
    if ((ch.jb(getString(".com.tencent.mm.debug.log.mmlog"))) && (ch.a(bT(".com.tencent.mm.debug.test.uploadLog"), false)))
    {
      bool3 = bool1;
      if (bool3)
      {
        String str = getString(".com.tencent.mm.debug.log.tag.skey");
        if ((str != null) && (str.length() > 0))
          z.ieQ = new cr(str);
      }
      boolean bool4 = this.dhK.getSharedPreferences("system_config_prefs", m.nN()).getBoolean("first_launch_weixin", bool1);
      if (!"MM".equalsIgnoreCase(paramString))
        bool4 = false;
      if (bool4)
        break label180;
    }
    while (true)
    {
      XLogSetup.keep_setupXLog(bool1, Integer.valueOf(a.hrn), com.tencent.mm.compatible.g.h.dOQ, localInteger, Boolean.valueOf(bool2), Boolean.valueOf(bool3), paramString, false);
      if (!"PUSH".equalsIgnoreCase(paramString))
        LogLogicJni.setErrLogOpen(false);
      return;
      bool3 = false;
      break;
      label180: bool1 = false;
    }
  }

  private Boolean bT(String paramString)
  {
    Object localObject = this.dhJ.get(paramString);
    if (localObject == null)
      return null;
    if ((localObject instanceof Boolean))
    {
      z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "getBoolean(): key=" + paramString + ", value=" + localObject.toString());
      return (Boolean)localObject;
    }
    return null;
  }

  private Integer getInteger(String paramString)
  {
    Object localObject = this.dhJ.get(paramString);
    if ((localObject instanceof Integer))
    {
      z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "getInteger(): key=" + paramString + ", value=" + localObject.toString());
      return (Integer)localObject;
    }
    return null;
  }

  public final String getString(String paramString)
  {
    Object localObject = this.dhJ.get(paramString);
    if ((localObject instanceof String))
    {
      z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "getString(): key=" + paramString + ", value=" + localObject.toString());
      return (String)localObject;
    }
    return null;
  }

  public final void kN()
  {
    bS("MM");
    ao.dVn = ch.a(bT(".com.tencent.mm.debug.test.display_errcode"), false);
    ao.dVo = ch.a(bT(".com.tencent.mm.debug.test.display_msgstate"), false);
    ao.dVp = ch.a(bT(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ao.dVq = ch.a(bT(".com.tencent.mm.debug.test.network.force_touch"), false);
    ao.dVr = ch.a(bT(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ao.dVs = ch.a(bT(".com.tencent.mm.debug.test.crashIsExit"), false);
    ao.dVQ = ch.getInt(ch.Y(getString(".com.tencent.mm.debug.datatransfer.times"), "0"), 0);
    ao.dVR = ch.getInt(ch.Y(getString(".com.tencent.mm.debug.datatransfer.duration"), "0"), 0);
    ao.dVu = ch.a(bT(".com.tencent.mm.debug.test.album_drop_table"), false);
    ao.dVv = ch.a(bT(".com.tencent.mm.debug.test.album_dle_file"), false);
    ao.dVw = ch.a(bT(".com.tencent.mm.debug.test.album_show_info"), false);
    ao.dVx = ch.a(bT(".com.tencent.mm.debug.test.location_help"), false);
    ao.dVz = ch.a(bT(".com.tencent.mm.debug.test.force_soso"), false);
    ao.dVA = ch.a(bT(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ao.dVB = ch.a(bT(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ao.dVC = ch.a(bT(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ao.dVF = ch.a(bT(".com.tencent.mm.debug.test.filterfpnp"), false);
    ao.dVG = ch.a(bT(".com.tencent.mm.debug.test.testForPull"), false);
    int i = ch.a(getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ao.dVD = i;
    if ((i != 4) && (ao.dVD > 0))
    {
      com.tencent.mm.storage.g.ihW = ao.dVD;
      z.e("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "cdn thread num " + ao.dVD);
    }
    ao.dVE = ch.a(bT(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    ao.dVH = ch.Y(getString(".com.tencent.mm.debug.server.host.http"), "");
    ao.dVI = ch.Y(getString(".com.tencent.mm.debug.server.host.socket"), "");
    if (ch.a(bT(".com.tencent.mm.debug.test.show_full_version"), false))
      com.tencent.mm.sdk.platformtools.l.iDs = true;
    try
    {
      int j = Integer.decode(getString(".com.tencent.mm.debug.log.setversion")).intValue();
      a.nf(j);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(j));
    }
    catch (Exception localException2)
    {
      try
      {
        this.dhH = Integer.decode(getString(".com.tencent.mm.debug.log.setchannel")).intValue();
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            boolean bool1 = ch.a(bT(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean bool2 = ch.a(bT(".com.tencent.mm.debug.report.kvstat"), false);
            boolean bool3 = ch.a(bT(".com.tencent.mm.debug.report.clientpref"), false);
            boolean bool4 = ch.a(bT(".com.tencent.mm.debug.report.useraction"), false);
            com.tencent.mm.plugin.f.a.h.a(bool1, bool2, bool3, bool4);
            new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
            ao.dVL = ch.a(bT(".com.tencent.mm.debug.test.update_test"), false);
            ao.dVM = ch.a(bT(".com.tencent.mm.debug.test.scan_save_image"), false);
            ao.dVO = ch.a(bT(".com.tencent.mm.debug.test.shake_get_config_list"), false);
            ao.dVP = ch.a(bT(".com.tencent.mm.debug.test.shake_show_shaketv"), false);
            ao.dVT = ch.Y(getString(".com.tencent.mm.debug.jsapi.permission"), "");
            z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.jsapiPermission = " + ao.dVT);
            ao.dWf = ch.Y(getString(".com.tencent.mm.debug.server.host.front"), "");
            ao.dWg = ch.Y(getString(".com.tencent.mm.debug.server.host.zone"), "");
            ao.dWh = ch.Y(getString(".com.tencent.mm.debug.server.cdnwifi_elt"), "");
            ao.dWi = ch.Y(getString(".com.tencent.mm.debug.server.cdnnowifi_elt"), "");
            ao.dWj = ch.Y(getString(".com.tencent.mm.debug.server.cdn_ptl"), "");
            ao.dWk = ch.a(bT(".com.tencent.mm.debug.cdn.isprogress"), true);
            ao.dWl = ch.a(bT(".com.tencent.mm.debug.cdn.onlysendetl"), false);
            ao.dWm = ch.a(bT(".com.tencent.mm.debug.cdn.onlysendptl"), false);
            return;
            localException1 = localException1;
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
            continue;
            localException2 = localException2;
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
          }
        }
        catch (Exception localException3)
        {
          while (true)
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
        }
      }
    }
  }

  public final void kO()
  {
    bS("PUSH");
    ao.dVn = ch.a(bT(".com.tencent.mm.debug.test.display_errcode"), false);
    ao.dVo = ch.a(bT(".com.tencent.mm.debug.test.display_msgstate"), false);
    ao.dVp = ch.a(bT(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ao.dVq = ch.a(bT(".com.tencent.mm.debug.test.network.force_touch"), false);
    ao.dVr = ch.a(bT(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ao.dVs = ch.a(bT(".com.tencent.mm.debug.test.crashIsExit"), false);
    ao.dVw = ch.a(bT(".com.tencent.mm.debug.test.album_show_info"), false);
    ao.dVx = ch.a(bT(".com.tencent.mm.debug.test.location_help"), false);
    ao.dVz = ch.a(bT(".com.tencent.mm.debug.test.force_soso"), false);
    ao.dVA = ch.a(bT(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ao.dVB = ch.a(bT(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ao.dVC = ch.a(bT(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ao.dVF = ch.a(bT(".com.tencent.mm.debug.test.filterfpnp"), false);
    ao.dVG = ch.a(bT(".com.tencent.mm.debug.test.testForPull"), false);
    int i = ch.a(getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ao.dVD = i;
    if ((i != 4) && (ao.dVD > 0))
    {
      com.tencent.mm.storage.g.ihW = ao.dVD;
      z.e("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "cdn thread num " + ao.dVD);
    }
    ao.dVE = ch.a(bT(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    ao.dVJ = ch.a(bT(".com.tencent.mm.debug.test.skip_getdns"), false);
    try
    {
      int j = Integer.decode(getString(".com.tencent.mm.debug.log.setversion")).intValue();
      a.nf(j);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(j));
    }
    catch (Exception localException2)
    {
      try
      {
        this.dhH = Integer.decode(getString(".com.tencent.mm.debug.log.setchannel")).intValue();
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            boolean bool1 = ch.a(bT(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean bool2 = ch.a(bT(".com.tencent.mm.debug.report.kvstat"), false);
            boolean bool3 = ch.a(bT(".com.tencent.mm.debug.report.clientpref"), false);
            boolean bool4 = ch.a(bT(".com.tencent.mm.debug.report.useraction"), false);
            com.tencent.mm.plugin.f.a.h.a(bool1, bool2, bool3, bool4);
            new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
            return;
            localException1 = localException1;
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
            continue;
            localException2 = localException2;
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
          }
        }
        catch (Exception localException3)
        {
          z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
        }
      }
    }
  }

  public final void kW()
  {
    bS("TOOL");
    ao.dVn = ch.a(bT(".com.tencent.mm.debug.test.display_errcode"), false);
    ao.dVo = ch.a(bT(".com.tencent.mm.debug.test.display_msgstate"), false);
    ao.dVp = ch.a(bT(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ao.dVq = ch.a(bT(".com.tencent.mm.debug.test.network.force_touch"), false);
    ao.dVr = ch.a(bT(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ao.dVs = ch.a(bT(".com.tencent.mm.debug.test.crashIsExit"), false);
    ao.dVw = ch.a(bT(".com.tencent.mm.debug.test.album_show_info"), false);
    ao.dVx = ch.a(bT(".com.tencent.mm.debug.test.location_help"), false);
    ao.dVz = ch.a(bT(".com.tencent.mm.debug.test.force_soso"), false);
    ao.dVA = ch.a(bT(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ao.dVB = ch.a(bT(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ao.dVC = ch.a(bT(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ao.dVF = ch.a(bT(".com.tencent.mm.debug.test.filterfpnp"), false);
    ao.dVG = ch.a(bT(".com.tencent.mm.debug.test.testForPull"), false);
    int i = ch.a(getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ao.dVD = i;
    if ((i != 4) && (ao.dVD > 0))
    {
      com.tencent.mm.storage.g.ihW = ao.dVD;
      z.e("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "cdn thread num " + ao.dVD);
    }
    ao.dVE = ch.a(bT(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      int j = Integer.decode(getString(".com.tencent.mm.debug.log.setversion")).intValue();
      a.nf(j);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(j));
    }
    catch (Exception localException2)
    {
      try
      {
        this.dhH = Integer.decode(getString(".com.tencent.mm.debug.log.setchannel")).intValue();
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            boolean bool1 = ch.a(bT(".com.tencent.mm.debug.report.debugmodel"), false);
            boolean bool2 = ch.a(bT(".com.tencent.mm.debug.report.kvstat"), false);
            boolean bool3 = ch.a(bT(".com.tencent.mm.debug.report.clientpref"), false);
            boolean bool4 = ch.a(bT(".com.tencent.mm.debug.report.useraction"), false);
            com.tencent.mm.plugin.f.a.h.a(bool1, bool2, bool3, bool4);
            new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
            ao.dVT = ch.Y(getString(".com.tencent.mm.debug.jsapi.permission"), "");
            z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.jsapiPermission = " + ao.dVT);
            ao.dVU = ch.Y(getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
            z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.generalCtrl = " + ao.dVU);
            ao.dVV = ch.a(bT(".com.tencent.mm.debug.skiploadurlcheck"), false);
            z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.skipLoadUrlCheck = " + ao.dVV);
            ao.dVW = ch.a(bT(".com.tencent.mm.debug.forcex5webview"), false);
            z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.forceX5WebView = " + ao.dVW);
            return;
            localException1 = localException1;
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
            continue;
            localException2 = localException2;
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
          }
        }
        catch (Exception localException3)
        {
          while (true)
            z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
        }
      }
    }
  }

  public final void kX()
  {
    try
    {
      bS("SANDBOX");
      ao.dVN = ch.a(bT(".com.tencent.mm.debug.test.network.simulate_down_fault"), false);
      z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.simulateDownFault = " + ao.dVN);
      return;
    }
    catch (Error localError)
    {
    }
  }

  public final void kY()
  {
    bS("EXDEVICE");
    ao.dVn = ch.a(bT(".com.tencent.mm.debug.test.display_errcode"), false);
    ao.dVo = ch.a(bT(".com.tencent.mm.debug.test.display_msgstate"), false);
    ao.dVp = ch.a(bT(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ao.dVq = ch.a(bT(".com.tencent.mm.debug.test.network.force_touch"), false);
    ao.dVr = ch.a(bT(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ao.dVs = ch.a(bT(".com.tencent.mm.debug.test.crashIsExit"), false);
    ao.dVw = ch.a(bT(".com.tencent.mm.debug.test.album_show_info"), false);
    ao.dVx = ch.a(bT(".com.tencent.mm.debug.test.location_help"), false);
    ao.dVz = ch.a(bT(".com.tencent.mm.debug.test.force_soso"), false);
    ao.dVA = ch.a(bT(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ao.dVB = ch.a(bT(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ao.dVC = ch.a(bT(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ao.dVF = ch.a(bT(".com.tencent.mm.debug.test.filterfpnp"), false);
    ao.dVG = ch.a(bT(".com.tencent.mm.debug.test.testForPull"), false);
    int i = ch.a(getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ao.dVD = i;
    if ((i != 4) && (ao.dVD > 0))
    {
      com.tencent.mm.storage.g.ihW = ao.dVD;
      z.e("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "cdn thread num " + ao.dVD);
    }
    ao.dVE = ch.a(bT(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      int j = Integer.decode(getString(".com.tencent.mm.debug.log.setversion")).intValue();
      a.nf(j);
      new StringBuilder("set up test protocal version = ").append(Integer.toHexString(j));
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          boolean bool1 = ch.a(bT(".com.tencent.mm.debug.report.debugmodel"), false);
          boolean bool2 = ch.a(bT(".com.tencent.mm.debug.report.kvstat"), false);
          boolean bool3 = ch.a(bT(".com.tencent.mm.debug.report.clientpref"), false);
          boolean bool4 = ch.a(bT(".com.tencent.mm.debug.report.useraction"), false);
          com.tencent.mm.plugin.f.a.h.a(bool1, bool2, bool3, bool4);
          new StringBuilder("try control report : debugModel[").append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
          ao.dVT = ch.Y(getString(".com.tencent.mm.debug.jsapi.permission"), "");
          z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.jsapiPermission = " + ao.dVT);
          ao.dVU = ch.Y(getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
          z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.generalCtrl = " + ao.dVU);
          ao.dVV = ch.a(bT(".com.tencent.mm.debug.skiploadurlcheck"), false);
          z.d("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "Test.skipLoadUrlCheck = " + ao.dVV);
          return;
          localException1 = localException1;
          z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
        }
      }
      catch (Exception localException2)
      {
        while (true)
          z.i("!32@/B4Tb64lLpKDiUa1siRPtt5j20lPwojX", "no debugger was got");
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.g
 * JD-Core Version:    0.6.2
 */