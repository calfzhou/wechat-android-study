package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.Map;

public final class a extends BaseAdapter
{
  private String cDi = x.pG();
  private ArrayList eLh;
  private d eLi;
  private Context mContext;

  public a(Context paramContext, String paramString1, String paramString2, d paramd)
  {
    this.mContext = paramContext;
    this.eLi = paramd;
    this.eLh = new ArrayList();
    ao(paramString1, paramString2);
  }

  private void ao(String paramString1, String paramString2)
  {
    z.d("!44@/B4Tb64lLpLiQ7OrT4MAaalqygKp6SVlEVRmCDix4bE=", paramString1);
    if (ch.jb(paramString1))
      z.e("!44@/B4Tb64lLpLiQ7OrT4MAaalqygKp6SVlEVRmCDix4bE=", "rank info is null or nil");
    Map localMap;
    do
    {
      com.tencent.mm.ai.b localb;
      do
      {
        return;
        localb = com.tencent.mm.ai.b.V(paramString1, paramString2);
      }
      while (localb == null);
      localMap = localb.dQU;
      int i = ch.getInt((String)localMap.get(".msg.appmsg.hardwareinfo.devicetype"), 0);
      if ((this.eLi != null) && (!this.eLi.hf(i)))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(i);
        z.i("!44@/B4Tb64lLpLiQ7OrT4MAaalqygKp6SVlEVRmCDix4bE=", "can not handler this device type : %d", arrayOfObject2);
        return;
      }
    }
    while ((localMap == null) || (localMap.isEmpty()));
    int j = 0;
    StringBuilder localStringBuilder1 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
    if (j == 0);
    String str2;
    for (String str1 = ""; ; str1 = "#" + j)
    {
      str2 = (String)localMap.get(str1 + ".username");
      if (!ch.jb(str2))
        break;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(j);
      z.i("!44@/B4Tb64lLpLiQ7OrT4MAaalqygKp6SVlEVRmCDix4bE=", "should break now : %d", arrayOfObject1);
      return;
    }
    StringBuilder localStringBuilder2 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
    String str3;
    label241: String str4;
    StringBuilder localStringBuilder3;
    if (j == 0)
    {
      str3 = "";
      str4 = (String)localMap.get(str3 + ".rank.rankdisplay");
      localStringBuilder3 = new StringBuilder(".msg.appmsg.hardwareinfo.rankview.rankinfolist.rankinfo");
      if (j != 0)
        break label387;
    }
    label387: for (String str5 = ""; ; str5 = "#" + j)
    {
      int k = ch.getInt((String)localMap.get(str5 + ".score.scoredisplay"), 0);
      c localc = new c();
      localc.cDi = str2;
      localc.eLo = str4;
      localc.score = k;
      this.eLh.add(localc);
      j++;
      break;
      str3 = "#" + j;
      break label241;
    }
  }

  public final int getCount()
  {
    return this.eLh.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.eLh.get(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    c localc = (c)getItem(paramInt);
    if ((localc != null) && (localc.cDi.equalsIgnoreCase(this.cDi)))
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    c localc = (c)getItem(paramInt);
    int i = getItemViewType(paramInt);
    LayoutInflater localLayoutInflater;
    View localView;
    b localb1;
    if (paramView == null)
    {
      localLayoutInflater = LayoutInflater.from(this.mContext);
      switch (i)
      {
      default:
        localView = localLayoutInflater.inflate(k.beG, paramViewGroup, false);
        b localb2 = new b();
        localb2.eLj = ((ImageView)localView.findViewById(i.arZ));
        localb2.eLk = ((TextView)localView.findViewById(i.asc));
        localb2.eLl = ((ImageView)localView.findViewById(i.asd));
        localb2.efn = ((TextView)localView.findViewById(i.ase));
        localb2.eLm = ((TextView)localView.findViewById(i.arY));
        localb2.eLn = ((ProgressBar)localView.findViewById(i.asb));
        localView.setTag(localb2);
        localb1 = localb2;
        label180: if (localc != null)
        {
          if (!localc.eLo.equals("1"))
            break label384;
          localb1.eLj.setImageResource(h.VI);
          localb1.eLj.setVisibility(0);
          localb1.eLk.setVisibility(8);
          label228: if (localc.score < 10000)
            break label513;
          localb1.eLn.setProgressDrawable(this.mContext.getResources().getDrawable(h.US));
          localb1.eLn.setProgress(100);
        }
        break;
      case 1:
      }
    }
    while (true)
    {
      localb1.eLm.setText(localc.score);
      com.tencent.mm.pluginsdk.ui.c.a(localb1.eLl, localc.cDi);
      TextView localTextView = localb1.efn;
      localTextView.setText(com.tencent.mm.ar.b.e(this.mContext, y.dh(localc.cDi), (int)localb1.efn.getTextSize()));
      return localView;
      localView = localLayoutInflater.inflate(k.beF, paramViewGroup, false);
      break;
      localb1 = (b)paramView.getTag();
      localView = paramView;
      break label180;
      label384: if (localc.eLo.equals("2"))
      {
        localb1.eLj.setImageResource(h.aaN);
        localb1.eLj.setVisibility(0);
        localb1.eLk.setVisibility(8);
        break label228;
      }
      if (localc.eLo.equals("3"))
      {
        localb1.eLj.setImageResource(h.SX);
        localb1.eLj.setVisibility(0);
        localb1.eLk.setVisibility(8);
        break label228;
      }
      localb1.eLk.setText(localc.eLo);
      localb1.eLj.setVisibility(8);
      localb1.eLk.setVisibility(0);
      break label228;
      label513: localb1.eLn.setProgressDrawable(this.mContext.getResources().getDrawable(h.UR));
      localb1.eLn.setProgress(localc.score / 100);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.a
 * JD-Core Version:    0.6.2
 */