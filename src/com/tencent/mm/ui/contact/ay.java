package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.ui.tools.be;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.voicesearch.j;
import java.io.IOException;

final class ay
  implements AdapterView.OnItemClickListener
{
  ay(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder("onItemClick ").append(paramInt);
    Object localObject;
    if (ChatroomContactUI.d(this.jyq) == null)
    {
      localObject = ChatroomContactUI.d(this.jyq);
      z.d("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", localObject);
      if (paramInt >= ChatroomContactUI.b(this.jyq).getHeaderViewsCount())
        break label82;
    }
    label82: int i;
    wz localwz;
    String str3;
    i locali2;
    Intent localIntent2;
    do
    {
      return;
      localObject = Boolean.valueOf(ChatroomContactUI.d(this.jyq).bcb());
      break;
      i = paramInt - ChatroomContactUI.b(this.jyq).getHeaderViewsCount();
      if ((ChatroomContactUI.d(this.jyq) == null) || (!ChatroomContactUI.d(this.jyq).bcb()))
        break label808;
      boolean bool1 = ChatroomContactUI.d(this.jyq).oL(i);
      boolean bool2 = ChatroomContactUI.d(this.jyq).rz(i);
      z.d("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onItemClick " + bool2);
      if (bool2)
      {
        j localj = ChatroomContactUI.d(this.jyq);
        if (ChatroomContactUI.e(this.jyq) == null);
        for (String str4 = ""; ; str4 = ChatroomContactUI.e(this.jyq).aAn())
        {
          localj.Dy(str4);
          return;
        }
      }
      if (!bool1)
        break label677;
      localwz = ChatroomContactUI.d(this.jyq).rx(i);
      str3 = localwz.hVf.getString();
      locali2 = bg.qW().oT().ys(str3);
      if (!a.cv(locali2.getType()))
        break label374;
      localIntent2 = new Intent(this.jyq, ContactInfoUI.class);
      localIntent2.putExtra("Contact_User", str3);
      localIntent2.putExtra("Contact_Scene", 3);
    }
    while ((str3 == null) || (str3.length() <= 0));
    if (locali2.aIg())
      n.fTF.q(10298, str3 + ",3");
    bb.c(localIntent2, str3);
    this.jyq.startActivity(localIntent2);
    return;
    label374: Intent localIntent3 = new Intent(this.jyq, ContactInfoUI.class);
    localIntent3.putExtra("Contact_User", localwz.hVf.getString());
    localIntent3.putExtra("Contact_Alias", localwz.dti);
    localIntent3.putExtra("Contact_Nick", localwz.ifj.getString());
    localIntent3.putExtra("Contact_Signature", localwz.dtg);
    localIntent3.putExtra("Contact_RegionCode", RegionCodeDecoder.v(localwz.dtm, localwz.Ks, localwz.Kt));
    localIntent3.putExtra("Contact_Sex", localwz.dtf);
    localIntent3.putExtra("Contact_VUser_Info", localwz.ifP);
    localIntent3.putExtra("Contact_VUser_Info_Flag", localwz.ifO);
    localIntent3.putExtra("Contact_KWeibo_flag", localwz.ifS);
    localIntent3.putExtra("Contact_KWeibo", localwz.ifQ);
    localIntent3.putExtra("Contact_KWeiboNick", localwz.ifR);
    localIntent3.putExtra("Contact_KSnsIFlag", localwz.ifU.dto);
    localIntent3.putExtra("Contact_KSnsBgId", localwz.ifU.dtq);
    localIntent3.putExtra("Contact_KSnsBgUrl", localwz.ifU.dtp);
    if (localwz.ifV != null);
    try
    {
      localIntent3.putExtra("Contact_customInfo", localwz.ifV.toByteArray());
      label627: if ((0x8 & localwz.ifO) > 0)
        n.fTF.q(10298, str3 + ",3");
      this.jyq.startActivity(localIntent3);
      return;
      label677: i locali1 = ChatroomContactUI.d(this.jyq).ry(i);
      if (locali1 == null)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(ChatroomContactUI.d(this.jyq).getCount());
        arrayOfObject[1] = Integer.valueOf(i);
        z.e("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", arrayOfObject);
        return;
      }
      String str2 = locali1.getUsername();
      Intent localIntent1 = new Intent(this.jyq.aPI(), ChattingUI.class);
      localIntent1.addFlags(67108864);
      localIntent1.putExtra("Chat_User", str2);
      localIntent1.putExtra("Chat_Mode", 1);
      this.jyq.aPI().startActivity(localIntent1);
      return;
      label808: String str1 = ((i)ChatroomContactUI.f(this.jyq).getItem(i)).getUsername();
      ChatroomContactUI.b(this.jyq, str1);
      return;
    }
    catch (IOException localIOException)
    {
      break label627;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ay
 * JD-Core Version:    0.6.2
 */