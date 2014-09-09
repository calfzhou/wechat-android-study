package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.aq.a;
import com.tencent.mm.f;
import com.tencent.mm.k;
import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.q.v;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.fi;
import com.tencent.mm.ui.cb;
import java.util.List;

final class ad extends cb
{
  private String eFH;
  private List edM;
  private com.tencent.mm.storage.b euc;
  private String[] jmD;

  public ad(Context paramContext, com.tencent.mm.storage.i parami, com.tencent.mm.storage.b paramb, String[] paramArrayOfString, List paramList)
  {
    super(paramContext, parami);
    this.euc = paramb;
    this.jmD = paramArrayOfString;
    this.edM = paramList;
  }

  public final void DW()
  {
    setCursor(bg.qW().oT().a(this.jmD, "@all.chatroom", this.eFH, this.edM));
    super.notifyDataSetChanged();
  }

  protected final void DX()
  {
    closeCursor();
    DW();
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ae localae1;
    com.tencent.mm.storage.i locali;
    int i;
    label105: String str1;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, k.bba, null);
      ae localae2 = new ae((byte)0);
      localae2.eoy = ((MaskLayout)paramView.findViewById(com.tencent.mm.i.agM));
      localae2.egA = ((TextView)paramView.findViewById(com.tencent.mm.i.agN));
      paramView.setTag(localae2);
      localae1 = localae2;
      locali = (com.tencent.mm.storage.i)getItem(paramInt);
      TextView localTextView1 = localae1.egA;
      Context localContext = this.context;
      if (y.dP(locali.getUsername()))
        break label263;
      i = f.Ou;
      localTextView1.setTextColor(a.m(localContext, i));
      c.a((ImageView)localae1.eoy.getContentView(), locali.getUsername());
      if (locali.jd() == 0)
        break label282;
      String str3 = at.qz().cJ(locali.jd());
      if (str3 == null)
        break label271;
      Bitmap localBitmap = v.fJ(str3);
      localae1.eoy.b(localBitmap, fi.jdH);
      label184: str1 = AtSomeoneUI.a(this.euc, locali.getUsername());
      if (!ap.jb(str1))
        break label293;
    }
    label263: label271: label282: label293: for (String str2 = locali.od(); ; str2 = str1)
    {
      TextView localTextView2 = localae1.egA;
      localTextView2.setText(com.tencent.mm.ar.b.e(this.context, str2, (int)localae1.egA.getTextSize()));
      return paramView;
      localae1 = (ae)paramView.getTag();
      break;
      i = f.Ov;
      break label105;
      localae1.eoy.aTa();
      break label184;
      localae1.eoy.aTa();
      break label184;
    }
  }

  public final void qI(String paramString)
  {
    this.eFH = paramString;
    a(null, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ad
 * JD-Core Version:    0.6.2
 */