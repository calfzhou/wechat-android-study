package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.BitmapFactory;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.a.c;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.ad;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.ap;

final class cq extends cl
{
  private hd joF;

  public cq()
  {
    super(20);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof p)) || (((p)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bct);
      paramView.setTag(new p(this.fjl).at(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    p localp = (p)paramck;
    this.joF = paramhd;
    String str1 = paramar.getContent();
    if (paramhd.jom)
    {
      int k = paramar.getContent().indexOf(':');
      if (k != -1)
        str1 = paramar.getContent().substring(k + 1);
    }
    String str2 = ch.xw(str1);
    if (str2 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str2, paramar.ku()); ; localb = null)
    {
      String str3;
      int i;
      Object localObject;
      String str4;
      if (localb != null)
      {
        str3 = localb.appId;
        i = localb.dRb;
        if ((str3 != null) && (str3.length() != 0))
          break label438;
        z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getAppInfo, appId is null");
        localObject = null;
        if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.k)localObject).avN()))
          a(paramhd, localb, paramar);
        if ((localObject != null) && (((com.tencent.mm.pluginsdk.model.app.k)localObject).field_appName != null) && (((com.tencent.mm.pluginsdk.model.app.k)localObject).field_appName.trim().length() > 0))
          break label515;
        str4 = localb.appName;
        label178: if ((localb.appId == null) || (localb.appId.length() <= 0) || (!l.at(str4)))
          break label542;
        localp.eTF.setText(l.a(paramhd.agh(), (com.tencent.mm.pluginsdk.model.app.k)localObject, str4));
        localp.eTF.setVisibility(0);
        if ((localObject == null) || (!((com.tencent.mm.pluginsdk.model.app.k)localObject).avN()))
          break label525;
        a(paramhd, localp.eTF, paramar, localb, ((com.tencent.mm.pluginsdk.model.app.k)localObject).field_packageName);
        label264: a(paramhd, localp.eTF, localb.appId);
        label278: if ((localb.ddY != null) && (localb.ddY.length() != 0))
          break label555;
        localp.jlV.setVisibility(8);
        label307: switch (localb.type)
        {
        default:
        case 2:
        }
      }
      label438: 
      do
      {
        if (l.i((com.tencent.mm.pluginsdk.model.app.k)localObject))
        {
          localp.jlW.setVisibility(0);
          localp.jlV.setVisibility(8);
          c(paramhd, localp.jlW, ms.a(localb, paramar));
        }
        localp.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
        localp.joC.setOnClickListener(paramhd.joh.jqc);
        if (this.hMJ)
          localp.joC.setOnLongClickListener(paramhd.joh.jqe);
        return;
        if (g.axW() == null)
        {
          z.e("!32@/B4Tb64lLpIuLnUbSWxToRnGurpHu6ve", "getISubCorePluginBase() == null");
          localObject = null;
          break;
        }
        com.tencent.mm.pluginsdk.model.app.k localk = g.axW().nt(str3);
        if ((localk == null) || (localk.field_appVersion < i));
        for (int j = 1; ; j = 0)
        {
          if (j != 0)
            g.axW().uJ(str3);
          localObject = localk;
          break;
        }
        str4 = ((com.tencent.mm.pluginsdk.model.app.k)localObject).field_appName;
        break label178;
        a(paramhd, localp.eTF, localb.appId);
        break label264;
        localp.eTF.setVisibility(8);
        break label278;
        localp.jlV.setVisibility(0);
        b(paramhd, localp.jlV, ms.Cr(localb.ddY));
        break label307;
        localp.eWm.setVisibility(0);
      }
      while (ap.yg().a(localp.eWm, paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), paramar.kA(), paramar.kB(), h.Tg, localp.eWq, h.Th));
      label515: label525: label542: label555: if (this.hMJ)
        localp.eWm.setImageResource(h.TB);
      while (true)
      {
        localp.eWm.post(new cr(this, localp));
        break;
        localp.eWm.setImageBitmap(BitmapFactory.decodeResource(paramhd.getResources(), h.Xv));
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    if (com.tencent.mm.am.a.to("favorite"))
      paramContextMenu.add(i, 116, 0, this.joF.getString(com.tencent.mm.n.bUO));
    int j = s.vc(this.joF.at(paramar.getContent(), paramar.jK()));
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.joF.at(paramar.getContent(), paramar.jK()));
    if (((localb.dQW <= 0) || ((localb.dQW > 0) && (j >= 100))) && (l.j(l.F(localb.appId, false))))
      paramContextMenu.add(i, 111, 0, this.joF.getString(com.tencent.mm.n.cag));
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, this.joF.getString(com.tencent.mm.n.bzz));
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 100:
      com.tencent.mm.ai.b localb;
      com.tencent.mm.pluginsdk.model.app.k localk;
      do
      {
        return false;
        String str = ch.xw(paramar.getContent());
        localb = null;
        if (str != null)
          localb = com.tencent.mm.ai.b.iS(str);
        if (localb != null)
          s.vb(localb.dQY);
        bw.v(paramar.kk());
        localk = l.F(localb.appId, false);
      }
      while ((localk == null) || (!localk.avN()));
      a(paramhd, localb, paramar, localk);
      return false;
    case 111:
    }
    Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_content", paramhd.at(paramar.getContent(), paramar.jK()));
    localIntent.putExtra("Retr_Msg_Type", 2);
    localIntent.putExtra("Retr_Msg_Id", paramar.kk());
    paramhd.startActivity(localIntent);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramhd.agh());
      return true;
    }
    String str1 = ch.xw(paramhd.at(paramar.getContent(), paramar.jK()));
    if (str1 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(str1); ; localb = null)
    {
      if (localb == null)
      {
        z.e("!56@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20aymqhkYVq7DhZjxB86qTYKw==", "content is null");
        return true;
      }
      com.tencent.mm.pluginsdk.model.app.k localk = l.F(localb.appId, true);
      if ((localk != null) && (localk.avN()))
        a(paramhd, localb, b(paramhd, paramar), localk);
      if ((localb.dQY != null) && (localb.dQY.length() > 0))
      {
        com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(localb.dQY);
        if ((locala == null) || (!locala.sl()))
        {
          if (paramar.jK() != 0)
            break;
          long l1 = paramar.kk();
          Intent localIntent1 = new Intent(this.joF.agh(), AppAttachDownloadUI.class);
          localIntent1.putExtra("app_msg_id", l1);
          this.joF.startActivity(localIntent1);
          return true;
        }
        String str4 = locala.field_fileFullPath;
        if (!c.ac(str4))
        {
          Intent localIntent2 = new Intent(paramhd.agh(), ResourcesExceedUI.class);
          localIntent2.putExtra("clean_view_type", 1);
          paramhd.startActivity(localIntent2);
          return true;
        }
        long l2 = (int)paramar.kk();
        paramar.kl();
        paramar.kt();
        if ((str4 == null) || (str4.equals("")) || (!c.ac(str4)))
        {
          z.d("!56@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20aymqhkYVq7DhZjxB86qTYKw==", "showImg : imgPath is null");
          return true;
        }
        Intent localIntent3 = new Intent(this.joF.agh(), ShowImageUI.class);
        localIntent3.putExtra("key_favorite", true);
        localIntent3.putExtra("key_image_path", str4);
        localIntent3.putExtra("key_message_id", l2);
        this.joF.startActivity(localIntent3);
        return true;
      }
      if ((localb.url == null) || (localb.url.length() <= 0))
        break;
      boolean bool = ay(paramhd.agh(), localb.appId);
      String str2 = u.a(localb.url, "message", bool);
      PackageInfo localPackageInfo = ai(paramhd.agh(), localb.appId);
      String str3 = null;
      if (localPackageInfo == null)
        if (localPackageInfo != null)
          break label470;
      label470: for (int i = 0; ; i = localPackageInfo.versionCode)
      {
        a(paramhd, str2, str2, str3, i, false, paramar.kk());
        return true;
        str3 = localPackageInfo.versionName;
        break;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cq
 * JD-Core Version:    0.6.2
 */