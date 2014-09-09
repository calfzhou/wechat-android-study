package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ai.b;
import com.tencent.mm.k;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.r;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

public final class du extends cj
{
  private hd joF;

  public du()
  {
    super(52);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof dv)) || (((dv)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcI);
      paramView.setTag(new dv(this, this.fjl).az(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    dv localdv = (dv)paramck;
    com.tencent.mm.ai.a locala = bf.GN().cp(paramar.kk());
    String str1 = paramar.getContent();
    b localb;
    if ((locala != null) && (str1 != null))
    {
      localb = b.V(str1, paramar.ku());
      ms localms = new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0);
      HardDeviceChattingItemView localHardDeviceChattingItemView = (HardDeviceChattingItemView)paramck.joC;
      if ((localb != null) && ((localb.cCB == 1) || (localb.dRJ == 1)))
      {
        String str2 = localb.dRE;
        String str3 = localb.dRF;
        if ((ch.jb(str2)) || (ch.jb(str3)))
        {
          z.e("!56@/B4Tb64lLpJ4OHK7JMOa8DHZqBwonFRRNdHfjPfP1PlY1v166tKAoA==", "color is null or highlight color is null, color = %s, highlight color = %s", new Object[] { str2, str3 });
          str2 = "#39b649";
          str3 = "#2d993c";
        }
        StateListDrawable localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { 16842919 }, new ColorDrawable(Color.parseColor(str3)));
        localStateListDrawable.addState(new int[] { 16842908 }, new ColorDrawable(Color.parseColor(str3)));
        localStateListDrawable.addState(new int[] { 16842766 }, new ColorDrawable(Color.parseColor(str2)));
        localStateListDrawable.addState(new int[0], new ColorDrawable(Color.parseColor(str2)));
        localHardDeviceChattingItemView.setBackgroundDrawable(localStateListDrawable);
        localdv.jpi.setText(localb.dRA);
        localdv.jpj.setText(localb.dRz);
        localdv.jpg.setText(localb.dRC);
        localdv.jph.setText(localb.dRB);
        localdv.jpk.setText(localb.dRD);
      }
      paramck.joC.setOnLongClickListener(paramhd.joh.jqe);
      paramck.joC.setTag(localms);
      paramck.joC.setOnClickListener(paramhd.joh.jqc);
      return;
    }
    Object[] arrayOfObject = new Object[4];
    if (locala == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject[0] = Boolean.valueOf(bool);
      arrayOfObject[1] = str1;
      arrayOfObject[2] = Long.valueOf(paramar.kk());
      arrayOfObject[3] = paramString;
      z.e("!56@/B4Tb64lLpKwUcOR+EdWcqqGVJnK8iwmbiZxNVncOS2bsW//QRniUw==", "amessage:%b, %s, %d, %s", arrayOfObject);
      localb = null;
      break;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    paramContextMenu.add(((ms)paramView.getTag()).position, 100, 0, this.joF.getString(n.bzz));
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 100:
    }
    while (true)
    {
      return false;
      String str = ch.xw(paramar.getContent());
      b localb = null;
      if (str != null)
        localb = b.iS(str);
      if (localb != null)
        s.vb(localb.dQY);
      bw.v(paramar.kk());
    }
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    String str = paramar.getContent();
    b localb = b.V(str, paramar.ku());
    Intent localIntent = new Intent();
    localIntent.putExtra("key_rank_info", str);
    localIntent.putExtra("key_rank_semi", paramar.ku());
    localIntent.putExtra("key_rank_title", localb.dRI);
    com.tencent.mm.am.a.b(paramhd.agh(), "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.du
 * JD-Core Version:    0.6.2
 */