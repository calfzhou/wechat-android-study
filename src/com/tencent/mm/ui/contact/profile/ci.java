package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.transmit.SelectConversationUI;

final class ci
  implements cm
{
  ci(cg paramcg)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 2:
      if (NormalUserFooterPreference.a(this.jEz.jEy.jEw).zV())
      {
        y.h(NormalUserFooterPreference.a(this.jEz.jEy.jEw));
        e.aw(NormalUserFooterPreference.b(this.jEz.jEy.jEw), NormalUserFooterPreference.b(this.jEz.jEy.jEw).getString(n.bDm));
      }
      while (true)
      {
        NormalUserFooterPreference.a(this.jEz.jEy.jEw, bg.qW().oT().ys(NormalUserFooterPreference.a(this.jEz.jEy.jEw).getUsername()));
        bg.qX().d(new k(5));
        return;
        y.g(NormalUserFooterPreference.a(this.jEz.jEy.jEw));
        e.aw(NormalUserFooterPreference.b(this.jEz.jEy.jEw), NormalUserFooterPreference.b(this.jEz.jEy.jEw).getString(n.bBB));
      }
    case 3:
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("sns_permission_userName", NormalUserFooterPreference.a(this.jEz.jEy.jEw).getUsername());
      localIntent2.putExtra("sns_permission_anim", true);
      com.tencent.mm.am.a.b(NormalUserFooterPreference.b(this.jEz.jEy.jEw), "sns", ".ui.SnsPermissionUI", localIntent2);
      return;
    case 4:
      cf localcf2 = this.jEz.jEy;
      Intent localIntent1 = new Intent(NormalUserFooterPreference.b(localcf2.jEw), SelectConversationUI.class);
      localIntent1.putExtra("Select_Talker_Name", NormalUserFooterPreference.a(localcf2.jEw).getUsername());
      localIntent1.putExtra("Select_block_List", NormalUserFooterPreference.a(localcf2.jEw).getUsername());
      localIntent1.putExtra("Select_Conv_Type", 3);
      localIntent1.putExtra("Select_Send_Card", true);
      NormalUserFooterPreference.b(localcf2.jEw).startActivityForResult(localIntent1, 1);
      return;
    case 1:
      this.jEz.jEy.jEw.dnh.ae("hide_btn");
      this.jEz.jEy.jEw.dnh.Bo();
      this.jEz.jEy.aDh();
      return;
    case 5:
      if (NormalUserFooterPreference.a(this.jEz.jEy.jEw).xI())
      {
        cf.a(this.jEz.jEy);
        return;
      }
      e.a(this.jEz.jEy.jEw.getContext(), this.jEz.jEy.jEw.getContext().getString(n.bCj), this.jEz.jEy.jEw.getContext().getString(n.bCi), new cj(this), null);
      return;
    case 6:
      Context localContext1 = this.jEz.jEy.jEw.getContext();
      Context localContext3;
      int j;
      Object[] arrayOfObject2;
      if (y.de(NormalUserFooterPreference.a(this.jEz.jEy.jEw).getUsername()))
      {
        localContext3 = this.jEz.jEy.jEw.getContext();
        j = n.bEe;
        arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = NormalUserFooterPreference.a(this.jEz.jEy.jEw).od();
      }
      Context localContext2;
      int i;
      Object[] arrayOfObject1;
      for (String str = localContext3.getString(j, arrayOfObject2); ; str = localContext2.getString(i, arrayOfObject1))
      {
        e.a(localContext1, str, "", this.jEz.jEy.jEw.getContext().getString(n.bsS), this.jEz.jEy.jEw.getContext().getString(n.bsK), new ck(this), null);
        return;
        localContext2 = this.jEz.jEy.jEw.getContext();
        i = n.bEd;
        arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = NormalUserFooterPreference.a(this.jEz.jEy.jEw).od();
      }
    case 7:
    }
    cf localcf1 = this.jEz.jEy;
    z.d("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "dealAddShortcut, username = " + NormalUserFooterPreference.a(localcf1.jEw).getUsername());
    com.tencent.mm.plugin.base.a.a.y(NormalUserFooterPreference.b(localcf1.jEw), NormalUserFooterPreference.a(localcf1.jEw).getUsername());
    com.tencent.mm.sdk.platformtools.am.b(new cq(localcf1), 1000L);
    e.aw(NormalUserFooterPreference.b(localcf1.jEw), NormalUserFooterPreference.b(localcf1.jEw).getString(n.bsH));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ci
 * JD-Core Version:    0.6.2
 */