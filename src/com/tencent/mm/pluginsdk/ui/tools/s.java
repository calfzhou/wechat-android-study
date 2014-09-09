package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Intent;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.q.a;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.storage.RegionCodeDecoder;

public final class s
{
  public static void a(Intent paramIntent, wz paramwz, int paramInt)
  {
    String str = ai.a(paramwz.hVf);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", ai.a(paramwz.ifj));
    paramIntent.putExtra("Contact_PyInitial", ai.a(paramwz.hUY));
    paramIntent.putExtra("Contact_QuanPin", ai.a(paramwz.hUZ));
    paramIntent.putExtra("Contact_Alias", paramwz.dti);
    paramIntent.putExtra("Contact_Sex", paramwz.dtf);
    paramIntent.putExtra("Contact_VUser_Info", paramwz.ifP);
    paramIntent.putExtra("Contact_VUser_Info_Flag", paramwz.ifO);
    paramIntent.putExtra("Contact_KWeibo_flag", paramwz.ifS);
    paramIntent.putExtra("Contact_KWeibo", paramwz.ifQ);
    paramIntent.putExtra("Contact_KWeiboNick", paramwz.ifR);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.v(paramwz.dtm, paramwz.Ks, paramwz.Kt));
    paramIntent.putExtra("Contact_Signature", paramwz.dtg);
    paramIntent.putExtra("Contact_BrandList", paramwz.dtn);
    paramIntent.putExtra("Contact_KSnsIFlag", paramwz.ifU.dto);
    paramIntent.putExtra("Contact_KSnsBgId", paramwz.ifU.dtq);
    paramIntent.putExtra("Contact_KSnsBgUrl", paramwz.ifU.dtp);
    a locala = new a();
    locala.field_username = str;
    locala.field_brandList = paramwz.dtn;
    ev localev = paramwz.ifV;
    if (localev != null)
    {
      locala.field_brandFlag = localev.dtr;
      locala.field_brandInfo = localev.dtt;
      locala.field_extInfo = localev.dts;
      locala.field_brandIconURL = localev.dtu;
    }
    if (!aa.uY().b(locala))
      aa.uY().a(locala);
  }

  public static void a(Intent paramIntent, xb paramxb, int paramInt)
  {
    String str = ai.a(paramxb.hVf);
    paramIntent.putExtra("Contact_User", str);
    paramIntent.putExtra("Contact_Nick", ai.a(paramxb.ifj));
    paramIntent.putExtra("Contact_PyInitial", ai.a(paramxb.hUY));
    paramIntent.putExtra("Contact_QuanPin", ai.a(paramxb.hUZ));
    paramIntent.putExtra("Contact_Alias", paramxb.dti);
    paramIntent.putExtra("Contact_Sex", paramxb.dtf);
    paramIntent.putExtra("Contact_VUser_Info", paramxb.ifP);
    paramIntent.putExtra("Contact_VUser_Info_Flag", paramxb.ifO);
    paramIntent.putExtra("Contact_KWeibo_flag", paramxb.ifS);
    paramIntent.putExtra("Contact_KWeibo", paramxb.ifQ);
    paramIntent.putExtra("Contact_KWeiboNick", paramxb.ifR);
    paramIntent.putExtra("Contact_Scene", paramInt);
    paramIntent.putExtra("Contact_KHideExpose", true);
    paramIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.v(paramxb.dtm, paramxb.Ks, paramxb.Kt));
    paramIntent.putExtra("Contact_Signature", paramxb.dtg);
    paramIntent.putExtra("Contact_BrandList", paramxb.dtn);
    paramIntent.putExtra("Contact_KSnsIFlag", paramxb.ifU.dto);
    paramIntent.putExtra("Contact_KSnsBgId", paramxb.ifU.dtq);
    paramIntent.putExtra("Contact_KSnsBgUrl", paramxb.ifU.dtp);
    a locala = new a();
    locala.field_username = str;
    locala.field_brandList = paramxb.dtn;
    ev localev = paramxb.ifV;
    if (localev != null)
    {
      locala.field_brandFlag = localev.dtr;
      locala.field_brandInfo = localev.dtt;
      locala.field_extInfo = localev.dts;
      locala.field_brandIconURL = localev.dtu;
    }
    if (!aa.uY().b(locala))
      aa.uY().a(locala);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.s
 * JD-Core Version:    0.6.2
 */