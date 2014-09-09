package com.tencent.mm.ui.pluginapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import java.io.IOException;

final class i
  implements AdapterView.OnItemClickListener
{
  i(ContactSearchResultUI paramContactSearchResultUI, int paramInt)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = paramInt - ContactSearchResultUI.a(this.jKG).getHeaderViewsCount();
    if ((i < 0) || (i >= ContactSearchResultUI.a(this.jKG).getCount()));
    wz localwz;
    String str;
    com.tencent.mm.storage.i locali;
    Intent localIntent1;
    do
    {
      return;
      localwz = (wz)ContactSearchResultUI.a(this.jKG).getItemAtPosition(i);
      str = localwz.hVf.getString();
      locali = bg.qW().oT().ys(str);
      if (!a.cv(locali.getType()))
        break;
      localIntent1 = new Intent(this.jKG, ContactInfoUI.class);
      localIntent1.putExtra("Contact_User", str);
      localIntent1.putExtra("Contact_Scene", 3);
    }
    while ((str == null) || (str.length() <= 0));
    if (locali.aIg())
    {
      n.fTF.q(10298, str + ",35");
      localIntent1.putExtra("Contact_Scene", 35);
    }
    this.jKG.startActivity(localIntent1);
    return;
    if ((0x8 & localwz.ifO) > 0)
      n.fTF.q(10298, localwz.hVf.getString() + ",35");
    Intent localIntent2 = new Intent(this.jKG, ContactInfoUI.class);
    localIntent2.putExtra("Contact_User", localwz.hVf.getString());
    localIntent2.putExtra("Contact_Alias", localwz.dti);
    localIntent2.putExtra("Contact_Nick", localwz.ifj.getString());
    localIntent2.putExtra("Contact_Signature", localwz.dtg);
    localIntent2.putExtra("Contact_RegionCode", RegionCodeDecoder.v(localwz.dtm, localwz.Ks, localwz.Kt));
    localIntent2.putExtra("Contact_Sex", localwz.dtf);
    localIntent2.putExtra("Contact_VUser_Info", localwz.ifP);
    localIntent2.putExtra("Contact_VUser_Info_Flag", localwz.ifO);
    localIntent2.putExtra("Contact_KWeibo_flag", localwz.ifS);
    localIntent2.putExtra("Contact_KWeibo", localwz.ifQ);
    localIntent2.putExtra("Contact_KWeiboNick", localwz.ifR);
    localIntent2.putExtra("Contact_KSnsIFlag", localwz.ifU.dto);
    localIntent2.putExtra("Contact_KSnsBgId", localwz.ifU.dtq);
    localIntent2.putExtra("Contact_KSnsBgUrl", localwz.ifU.dtp);
    localIntent2.putExtra("Contact_Scene", 35);
    if (this.jKH != 0)
      localIntent2.putExtra("add_more_friend_search_scene", this.jKH);
    if (localwz.ifV != null);
    try
    {
      localIntent2.putExtra("Contact_customInfo", localwz.ifV.toByteArray());
      label514: if ((0x8 & localwz.ifO) > 0)
        n.fTF.q(10298, localwz.hVf.getString() + ",35");
      this.jKG.startActivity(localIntent2);
      return;
    }
    catch (IOException localIOException)
    {
      break label514;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.i
 * JD-Core Version:    0.6.2
 */