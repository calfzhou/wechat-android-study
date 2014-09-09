package com.tencent.mm.modelstat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class a
{
  private b dDK = null;
  private final String dDL;

  public a(String paramString)
  {
    this.dDL = paramString;
  }

  public final b zR()
  {
    b localb1 = null;
    if (this.dDK != null)
      return this.dDK;
    String str = this.dDL + "mobileinfo.ini";
    File localFile = new File(str);
    b localb2;
    if (!localFile.exists())
    {
      z.i("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readConfig file not exist :%s", new Object[] { str });
      localb2 = null;
    }
    while (true)
    {
      this.dDK = localb2;
      if ((this.dDK == null) || (this.dDK.dDO))
        break;
      z.v("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "checkInfo mobile info cache Read file succ.");
      return this.dDK;
      g localg1 = new g(str);
      localb2 = new b();
      localb2.dDM = ch.a(localg1.jy("ispCode"));
      localb2.ispName = localg1.getValue("ispName");
      localb2.dDN = ch.a(localg1.jy("subType"));
      localb2.extraInfo = localg1.getValue("extraInfo");
      long l = localFile.lastModified();
      if ((10011 == ao.dVY) && (ao.dVZ > 0))
      {
        l = ch.CM() - ao.dVZ;
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Integer.valueOf(ao.dVZ);
        arrayOfObject4[1] = Long.valueOf(l);
        z.w("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readConfig DK_TEST_MOBILEINFOFILE_MODTIME val:%d lm:%d", arrayOfObject4);
        ao.dVZ = 0;
      }
      if ((l > 0L) && (ch.ac(l) > 259200000L))
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Long.valueOf(ch.ac(l));
        arrayOfObject3[1] = str;
        z.w("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readConfig  diff:%d file:%s cache expired remove!", arrayOfObject3);
        localb2.dDO = true;
      }
      Object[] arrayOfObject1 = new Object[5];
      arrayOfObject1[0] = Integer.valueOf(localb2.dDN);
      arrayOfObject1[1] = Integer.valueOf(localb2.dDM);
      arrayOfObject1[2] = localb2.ispName;
      arrayOfObject1[3] = localb2.extraInfo;
      arrayOfObject1[4] = Boolean.valueOf(localb2.dDO);
      z.i("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readConfig MobileInfo subType:%d ispCode:%d ispName:%s extraInfo:%s expired:%b", arrayOfObject1);
    }
    Context localContext = ak.getContext();
    if (localContext == null)
      z.e("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readInfoBySystem MMApplicationContext is null");
    while (localb1 == null)
    {
      z.v("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readInfoBySystem failed , use old.");
      return this.dDK;
      ConnectivityManager localConnectivityManager = (ConnectivityManager)localContext.getSystemService("connectivity");
      if (localConnectivityManager == null)
      {
        z.e("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readInfoBySystem ConnectivityManager is null");
        localb1 = null;
      }
      else
      {
        NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
        if (localNetworkInfo == null)
        {
          z.e("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readInfoBySystem getActiveNetworkInfo is null");
          localb1 = null;
        }
        else if (localNetworkInfo.getType() == 1)
        {
          z.e("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readInfoBySystem net type is wifi");
          localb1 = null;
        }
        else
        {
          localb1 = new b();
          localb1.dDN = localNetworkInfo.getSubtype();
          localb1.dDM = bc.bB(localContext);
          localb1.ispName = bc.bC(localContext);
          localb1.extraInfo = localNetworkInfo.getExtraInfo();
          Object[] arrayOfObject2 = new Object[4];
          arrayOfObject2[0] = Integer.valueOf(localb1.dDN);
          arrayOfObject2[1] = Integer.valueOf(localb1.dDM);
          arrayOfObject2[2] = localb1.ispName;
          arrayOfObject2[3] = localb1.extraInfo;
          z.i("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "readInfoBySystem subType:%d ispCode:%d ispName:%s extraInfo:%s", arrayOfObject2);
        }
      }
    }
    this.dDK = localb1;
    b localb3 = this.dDK;
    if (localb3 == null)
      z.e("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "saveConfig info is null");
    while (true)
    {
      return this.dDK;
      if (ch.jb(str))
      {
        z.e("!64@/B4Tb64lLpKsMp00pgLFBpt4T6Eocwl+KTPY3tRlFyXZNWG0xH3GFhtY2crCyjH0", "saveConfig path is null");
      }
      else
      {
        g localg2 = new g(str);
        localg2.v("ispCode", localb3.dDM);
        localg2.W("ispName", localb3.ispName);
        localg2.v("subType", localb3.dDN);
        localg2.W("extraInfo", localb3.extraInfo);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.a
 * JD-Core Version:    0.6.2
 */