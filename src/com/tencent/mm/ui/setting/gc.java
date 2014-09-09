package com.tencent.mm.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cs;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.dy;

public final class gc
  implements m
{
  private Context context = null;
  private ProgressDialog dWT = null;
  private Bitmap dnb = null;
  private ImageView eyY = null;
  private aa fav = null;
  private TextView jLJ = null;
  private TextView jLK = null;
  private ImageView jLf = null;
  private ViewGroup jOt = null;
  private String username = "";

  public gc(Context paramContext, String paramString)
  {
    this.username = paramString;
    this.context = paramContext;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramx.getType() != 168) || (dy.a(this.context, paramInt1, paramInt2, paramString, 7)));
    do
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Context localContext1 = this.context;
        Context localContext2 = this.context;
        int i = n.bLd;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(localContext1, localContext2.getString(i, arrayOfObject), 0).show();
        return;
      }
    }
    while (this.jLf == null);
    this.dnb = com.tencent.mm.af.b.yT();
    this.jLf.setImageBitmap(this.dnb);
  }

  public final void onCreate()
  {
    bg.qX().a(158, this);
    bg.qX().a(168, this);
  }

  public final void onDestroy()
  {
    bg.qX().b(168, this);
    bg.qX().b(158, this);
    if ((this.dnb != null) && (!this.dnb.isRecycled()))
      this.dnb.recycle();
    if ((this.fav != null) && (this.fav.isShowing()))
      this.fav.dismiss();
    this.fav = null;
    this.context = null;
  }

  public final void show()
  {
    this.jOt = ((ViewGroup)View.inflate(this.context, k.baC, null));
    this.jOt.setOnTouchListener(new gd(this));
    this.jLf = ((ImageView)this.jOt.findViewById(i.aOi));
    this.eyY = ((ImageView)this.jOt.findViewById(i.axs));
    this.jLJ = ((TextView)this.jOt.findViewById(i.aGk));
    this.jLK = ((TextView)this.jOt.findViewById(i.apS));
    this.dnb = com.tencent.mm.af.b.yT();
    if (this.dnb == null)
    {
      z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "%s", new Object[] { "bitmap == null" });
      com.tencent.mm.af.a locala = new com.tencent.mm.af.a(this.username, ch.a((Integer)bg.qW().oQ().get(66561)));
      bg.qX().d(locala);
      Context localContext2 = this.context;
      this.context.getString(n.buo);
      this.dWT = com.tencent.mm.ui.base.e.a(localContext2, this.context.getString(n.cdL), true, new ge(this, locala));
      c.a(this.eyY, com.tencent.mm.model.x.pG());
      String str1 = (String)bg.qW().oQ().get(4);
      z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "nick name = %s", new Object[] { str1 });
      TextView localTextView = this.jLJ;
      localTextView.setText(com.tencent.mm.ar.b.c(this.context, str1, (int)this.jLJ.getTextSize()));
      cs localcs = cs.rQ();
      String str2 = ch.ja(localcs.jp());
      String str3 = ch.ja(localcs.jq());
      String str4 = y.dX(str2) + " " + str3;
      z.d("!44@/B4Tb64lLpKORaI7+vlNDDvpNc7edh27uicyrYE73Vc=", "display location = %s", new Object[] { str4 });
      this.jLK.setText(str4);
      switch (ch.a((Integer)bg.qW().oQ().get(12290), 0))
      {
      default:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      if ((this.fav == null) || (!this.fav.isShowing()))
        break label490;
      return;
      this.jLf.setImageBitmap(this.dnb);
      break;
      this.jLJ.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.aq.a.n(this.context, h.VQ), null);
      continue;
      this.jLJ.setCompoundDrawablesWithIntrinsicBounds(null, null, com.tencent.mm.aq.a.n(this.context, h.VP), null);
    }
    label490: Context localContext1 = this.context;
    ViewGroup localViewGroup = this.jOt;
    aa localaa;
    if (((localContext1 instanceof Activity)) && (((Activity)localContext1).isFinishing()))
      localaa = null;
    while (true)
    {
      this.fav = localaa;
      this.fav.setCanceledOnTouchOutside(true);
      return;
      ad localad = new ad(localContext1);
      localad.BK(null);
      localad.ao(localViewGroup);
      localad.eN(true);
      localaa = localad.aRB();
      localaa.show();
      com.tencent.mm.ui.base.e.a(localContext1, localaa);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.gc
 * JD-Core Version:    0.6.2
 */