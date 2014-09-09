package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.voicesearch.j;
import java.io.IOException;

final class y
  implements AdapterView.OnItemClickListener
{
  y(e parame)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder("onItemClick ").append(paramInt);
    Object localObject;
    if (e.e(this.jxW) == null)
    {
      localObject = e.e(this.jxW);
      z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", localObject);
      if ((paramInt != 0) || ("@biz.contact".equals(e.f(this.jxW))))
        break label87;
    }
    while (true)
    {
      return;
      localObject = Boolean.valueOf(e.e(this.jxW).bcb());
      break;
      label87: if (paramInt < e.c(this.jxW).getHeaderViewsCount())
        continue;
      int i = paramInt - e.c(this.jxW).getHeaderViewsCount();
      wz localwz;
      String str3;
      Intent localIntent5;
      if ((e.e(this.jxW) != null) && (e.e(this.jxW).bcb()))
      {
        boolean bool1 = e.e(this.jxW).oL(i);
        boolean bool2 = e.e(this.jxW).rz(i);
        z.d("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "onItemClick " + bool2);
        if (bool2)
        {
          e.e(this.jxW).Dy("");
          return;
        }
        if (bool1)
        {
          localwz = e.e(this.jxW).rx(i);
          str3 = localwz.hVf.getString();
          i locali2 = bg.qW().oT().ys(str3);
          if (com.tencent.mm.g.a.cv(locali2.getType()))
          {
            Intent localIntent4 = new Intent(this.jxW.agh(), ContactInfoUI.class);
            localIntent4.putExtra("Contact_User", str3);
            localIntent4.putExtra("Contact_Scene", 3);
            if ((str3 == null) || (str3.length() <= 0))
              continue;
            if (locali2.aIg())
              n.fTF.q(10298, str3 + ",3");
            bb.c(localIntent4, str3);
            this.jxW.startActivity(localIntent4);
            return;
          }
          localIntent5 = new Intent(this.jxW.agh(), ContactInfoUI.class);
          localIntent5.putExtra("Contact_User", localwz.hVf.getString());
          localIntent5.putExtra("Contact_Alias", localwz.dti);
          localIntent5.putExtra("Contact_Nick", localwz.ifj.getString());
          localIntent5.putExtra("Contact_Signature", localwz.dtg);
          localIntent5.putExtra("Contact_RegionCode", RegionCodeDecoder.v(localwz.dtm, localwz.Ks, localwz.Kt));
          localIntent5.putExtra("Contact_Sex", localwz.dtf);
          localIntent5.putExtra("Contact_VUser_Info", localwz.ifP);
          localIntent5.putExtra("Contact_VUser_Info_Flag", localwz.ifO);
          localIntent5.putExtra("Contact_KWeibo_flag", localwz.ifS);
          localIntent5.putExtra("Contact_KWeibo", localwz.ifQ);
          localIntent5.putExtra("Contact_KWeiboNick", localwz.ifR);
          localIntent5.putExtra("Contact_KSnsIFlag", localwz.ifU.dto);
          localIntent5.putExtra("Contact_KSnsBgId", localwz.ifU.dtq);
          localIntent5.putExtra("Contact_KSnsBgUrl", localwz.ifU.dtp);
          if (localwz.ifV == null);
        }
      }
      try
      {
        localIntent5.putExtra("Contact_customInfo", localwz.ifV.toByteArray());
        label620: if ((0x8 & localwz.ifO) > 0)
          n.fTF.q(10298, str3 + ",3");
        this.jxW.startActivity(localIntent5);
        return;
        i locali1 = e.e(this.jxW).ry(i);
        if (locali1 == null)
        {
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = Integer.valueOf(e.e(this.jxW).getCount());
          arrayOfObject[1] = Integer.valueOf(i);
          z.e("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "on Contact ListView ItemClick, the item contact shoud not be null. count:%d, pos:%d ", arrayOfObject);
          return;
        }
        String str2 = locali1.getUsername();
        if (com.tencent.mm.model.y.dG(str2))
        {
          Intent localIntent2 = new Intent(this.jxW.agh(), AddressUI.class);
          localIntent2.putExtra("Contact_GroupFilter_Type", "@biz.contact");
          this.jxW.startActivity(localIntent2);
          return;
        }
        Intent localIntent3 = new Intent(this.jxW.agh(), ContactInfoUI.class);
        localIntent3.putExtra("Contact_User", str2);
        localIntent3.putExtra("Contact_Scene", 3);
        if ((str2 == null) || (str2.length() <= 0))
          continue;
        this.jxW.startActivity(localIntent3);
        return;
        com.tencent.mm.storage.a locala = (com.tencent.mm.storage.a)e.a(this.jxW).cn(i);
        if (locala == null)
          continue;
        String str1 = locala.getUsername();
        e locale = this.jxW;
        if ((str1 == null) || (str1.length() <= 0))
          continue;
        if (com.tencent.mm.model.y.dG(str1))
        {
          z.e("!32@/B4Tb64lLpJvPADYHZ60V4qqnXgYeWWp", "error, 4.5 do not contain this contact %s", new Object[] { str1 });
          return;
        }
        Intent localIntent1 = new Intent();
        localIntent1.setClass(locale.agh(), ContactInfoUI.class);
        localIntent1.putExtra("Contact_User", str1);
        if (com.tencent.mm.model.y.de(str1))
          localIntent1.putExtra("Is_group_card", true);
        if ((str1 == null) || (str1.length() <= 0))
          continue;
        bb.c(localIntent1, str1);
        locale.startActivity(localIntent1);
        return;
      }
      catch (IOException localIOException)
      {
        break label620;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.y
 * JD-Core Version:    0.6.2
 */