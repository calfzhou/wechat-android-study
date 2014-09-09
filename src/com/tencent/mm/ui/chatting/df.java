package com.tencent.mm.ui.chatting;

import android.content.Context;
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
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.ap;

final class df extends cm
{
  private hd joF;

  public df()
  {
    super(21);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof p)) || (((p)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bcO);
      paramView.setTag(new p(this.fjl).at(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    p localp = (p)paramck;
    this.joF = paramhd;
    String str1 = ch.xw(paramar.getContent());
    if (str1 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      com.tencent.mm.pluginsdk.model.app.k localk;
      String str2;
      label174: label188: label212: int i;
      if (localb != null)
      {
        localk = l.F(localb.appId, true);
        if ((localk == null) || (localk.field_appName == null) || (localk.field_appName.trim().length() <= 0))
        {
          str2 = localb.appName;
          if ((localb.appId == null) || (localb.appId.length() <= 0) || (!l.at(str2)))
            break label395;
          localp.eTF.setText(l.a(paramhd.agh(), localk, str2));
          localp.eTF.setVisibility(0);
          if ((localk == null) || (!localk.avN()))
            break label378;
          a(paramhd, localp.eTF, paramar, localb, localk.field_packageName);
          a(paramhd, localp.eTF, localb.appId);
        }
      }
      else
      {
        switch (localb.type)
        {
        default:
          localp.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
          localp.joC.setOnClickListener(paramhd.joh.jqc);
          if (this.hMJ)
            localp.joC.setOnLongClickListener(paramhd.joh.jqe);
          i = s.vc(str1);
          if ((i == -1) || (i >= 100) || (localb.dQW <= 0) || (paramar.getStatus() == 5))
          {
            localp.eSF.setVisibility(8);
            localp.eWm.setAlpha(255);
            localp.eWm.setBackgroundDrawable(null);
          }
          break;
        case 2:
        }
      }
      while (true)
      {
        a(paramInt, localp, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
        return;
        str2 = localk.field_appName;
        break;
        label378: a(paramhd, localp.eTF, localb.appId);
        break label174;
        label395: localp.eTF.setVisibility(8);
        break label188;
        localp.eWm.setVisibility(0);
        if (ap.yg().a(localp.eWm, paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), paramar.kA(), paramar.kB(), h.Ti, localp.eWq, h.Tj))
          break label212;
        if (this.hMJ)
          localp.eWm.setImageResource(h.TC);
        while (true)
        {
          localp.eWm.post(new dg(this, localp));
          break;
          localp.eWm.setImageBitmap(BitmapFactory.decodeResource(paramhd.getResources(), h.Xv));
        }
        localp.eSF.setVisibility(0);
        localp.jlU.setText(i + "%");
        localp.eWm.setAlpha(64);
        localp.eWm.setBackgroundResource(h.aam);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    if (com.tencent.mm.am.a.to("favorite"))
      paramContextMenu.add(i, 116, 0, this.joF.getString(com.tencent.mm.n.bUO));
    String str = paramar.getContent();
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.joF.at(str, paramar.jK()));
    if ((localb != null) && (l.j(l.F(localb.appId, false))))
      paramContextMenu.add(i, 111, 0, this.joF.getString(com.tencent.mm.n.cag));
    if ((!paramar.aJv()) && (paramar.aJH()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(com.tencent.mm.n.bzE));
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
    localIntent.putExtra("Retr_Msg_content", paramar.getContent());
    localIntent.putExtra("Retr_Msg_Type", 2);
    localIntent.putExtra("Retr_Msg_Id", paramar.kk());
    paramhd.startActivity(localIntent);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    boolean bool1;
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramhd.agh());
      bool1 = true;
      return bool1;
    }
    if ((((ms)paramView.getTag()).fjl == 5) && (paramar.jK() == 1))
    {
      if (paramar != null)
        e.a(this.joF.agh(), this.joF.getString(com.tencent.mm.n.bAa), "", this.joF.getString(com.tencent.mm.n.bub), this.joF.getString(com.tencent.mm.n.bsK), new dh(this, paramar), new di(this));
      return true;
    }
    String str1 = ch.xw(paramar.getContent());
    if (str1 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(str1); ; localb = null)
    {
      if (localb == null)
      {
        z.e("!56@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20aA6m3cO6vD5WHcARpvCcmNQ==", "content is null");
        return true;
      }
      com.tencent.mm.pluginsdk.model.app.k localk = l.F(localb.appId, false);
      if ((localk != null) && (localk.avN()))
        a(paramhd, localb, x.pG(), localk);
      if ((localb.dQY != null) && (localb.dQY.length() > 0))
      {
        com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(localb.dQY);
        bool1 = false;
        if (locala == null)
          break;
        if (!bg.qW().isSDCardAvailable())
          en.cp(paramhd.agh());
        while (true)
        {
          return true;
          if (paramar.jK() == 1)
          {
            String str5 = locala.field_fileFullPath;
            if (!c.ac(str5))
              break;
            int k = (int)paramar.kk();
            paramar.kl();
            paramar.kt();
            if ((str5 == null) || (str5.equals("")) || (!c.ac(str5)))
            {
              z.d("!56@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20aA6m3cO6vD5WHcARpvCcmNQ==", "showImg : imgPath is null");
            }
            else
            {
              Intent localIntent2 = new Intent(this.joF.agh(), ShowImageUI.class);
              localIntent2.putExtra("key_favorite", true);
              localIntent2.putExtra("key_image_path", str5);
              localIntent2.putExtra("key_message_id", k);
              this.joF.startActivity(localIntent2);
            }
          }
        }
        Intent localIntent1 = new Intent(paramhd.agh(), ResourcesExceedUI.class);
        localIntent1.putExtra("clean_view_type", 1);
        paramhd.startActivity(localIntent1);
        return true;
      }
      String str2 = localb.url;
      bool1 = false;
      if (str2 == null)
        break;
      int i = localb.url.length();
      bool1 = false;
      if (i <= 0)
        break;
      boolean bool2 = ay(paramhd.agh(), localb.appId);
      String str3 = u.a(localb.url, "message", bool2);
      PackageInfo localPackageInfo = ai(paramhd.agh(), localb.appId);
      String str4 = null;
      if (localPackageInfo == null)
        if (localPackageInfo != null)
          break label536;
      label536: for (int j = 0; ; j = localPackageInfo.versionCode)
      {
        a(paramhd, str3, str3, str4, j, false, paramar.kk());
        return false;
        str4 = localPackageInfo.versionName;
        break;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.df
 * JD-Core Version:    0.6.2
 */