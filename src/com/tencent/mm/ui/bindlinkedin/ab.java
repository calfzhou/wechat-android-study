package com.tencent.mm.ui.bindlinkedin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.bi;
import com.tencent.mm.modelfriend.bj;
import com.tencent.mm.n;
import com.tencent.mm.ui.cb;

public final class ab extends cb
{
  private Context context = null;
  private com.tencent.mm.pluginsdk.ui.tools.ag fRk = null;
  private LayoutInflater jjA;
  private String jjB = null;
  private af jjC = null;

  public ab(Context paramContext, String paramString)
  {
    super(paramContext, new bi());
    this.context = paramContext;
    this.jjB = paramString;
    this.jjA = LayoutInflater.from(this.context);
    this.fRk = new ac(this);
  }

  public final void DW()
  {
    setCursor(az.CG().jm(this.jjB));
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    DW();
  }

  public final void a(af paramaf)
  {
    this.jjC = paramaf;
  }

  final void aUb()
  {
    this.fRk.RF();
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ag localag2;
    bi localbi;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = this.jjA.inflate(k.bhb, null);
      ag localag1 = new ag(paramView, (byte)0);
      paramView.setTag(localag1);
      localag2 = localag1;
      localbi = (bi)getItem(paramInt);
      localag2.jjF.setText(localbi.field_name);
      localag2.jjG.setText(localbi.field_position);
      if ((localbi.field_status != 1) && (localbi.field_status != 2))
        break label349;
      if (localbi.field_status != 1)
        break label244;
      if (localbi.field_userOpStatus != 1)
        break label193;
      localag2.jjH.setText(n.cDx);
      localag2.jjH.setTextColor(f.ahh);
      localag2.jjH.setBackgroundResource(0);
      localag2.jjH.setOnClickListener(null);
    }
    label193: label349: 
    while (true)
    {
      this.fRk.a(localag2.jjE, null, localbi.field_picUrl, h.WL, 0, 0);
      return paramView;
      localag2 = (ag)paramView.getTag();
      break;
      localag2.jjH.setText(n.bLA);
      localag2.jjH.setTextColor(-1);
      localag2.jjH.setBackgroundResource(h.SZ);
      localag2.jjH.setOnClickListener(new ad(this, paramInt));
      continue;
      label244: if (localbi.field_userOpStatus == 1)
      {
        localag2.jjH.setText(n.bLC);
        localag2.jjH.setTextColor(f.ahh);
        localag2.jjH.setBackgroundResource(0);
        localag2.jjH.setOnClickListener(null);
      }
      else
      {
        localag2.jjH.setText(n.cDk);
        localag2.jjH.setTextColor(f.ahh);
        localag2.jjH.setBackgroundResource(h.Ta);
        localag2.jjH.setOnClickListener(new ae(this, paramInt));
        continue;
        if (localbi.field_status == 3)
        {
          localag2.jjH.setText(n.bLB);
          localag2.jjH.setTextColor(f.ahh);
          localag2.jjH.setBackgroundResource(0);
          localag2.jjH.setOnClickListener(null);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.ab
 * JD-Core Version:    0.6.2
 */