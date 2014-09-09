package com.tencent.mm.ui.bindqq;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public final class g
  implements com.tencent.mm.o.m
{
  private Context context;
  private View fMO;
  private aa fav;
  private SecurityImage iMR;
  private String iPI;
  private String iPK;
  private String iPL;
  private byte[] iPM;
  private cr iPc;
  private o jkV;

  public g(Context paramContext, o paramo)
  {
    this.context = paramContext;
    this.fMO = null;
    this.iPc = null;
    this.fav = null;
    this.iPI = "";
    this.iMR = null;
    this.iPM = null;
    this.iPK = "";
    this.jkV = paramo;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    onDetach();
    if ((paramx == null) || (paramx.getType() != 144));
    com.tencent.mm.d.a locala1;
    do
    {
      do
      {
        com.tencent.mm.d.a locala2;
        do
        {
          Activity localActivity;
          do
          {
            do
            {
              return;
              if (this.iPc != null)
              {
                this.iPc.dismiss();
                this.iPc = null;
              }
              this.iPK = ((com.tencent.mm.p.a)paramx).tX();
              this.iPM = ((com.tencent.mm.p.a)paramx).tW();
            }
            while ((this.jkV != null) && (this.jkV.l(paramInt1, paramInt2, paramString)));
            if (!(this.context instanceof Activity))
              break;
            localActivity = (Activity)this.context;
          }
          while ((localActivity.isFinishing()) || ((Build.VERSION.SDK_INT >= 17) && (localActivity.isDestroyed())));
          if (paramInt1 != 4)
            break;
          switch (paramInt2)
          {
          default:
            locala2 = com.tencent.mm.d.a.ct(paramString);
          case -6:
          case 10000:
          case -72:
          }
        }
        while (locala2 == null);
        locala2.a(this.context, null, null);
        return;
      }
      while (!bg.oE());
      if (this.iMR == null)
      {
        this.iMR = com.tencent.mm.ui.applet.m.a(this.context, com.tencent.mm.n.bZc, false, this.iPM, this.iPK, this.iPL, new l(this), null, new n(this), new p(this));
        return;
      }
      this.iMR.b(false, this.iPM, this.iPK, this.iPL);
      return;
      k localk = new k(this);
      this.fav = e.a(this.context, this.context.getString(com.tencent.mm.n.byK), this.context.getString(com.tencent.mm.n.buo), localk, null);
      return;
      this.fav = e.b(this.context, com.tencent.mm.n.bzP, com.tencent.mm.n.buo);
      return;
      locala1 = com.tencent.mm.d.a.ct(paramString);
    }
    while (locala1 == null);
    locala1.a(this.context, null, null);
  }

  public final void a(aa paramaa)
  {
    this.fav = null;
  }

  public final void aUj()
  {
    this.fMO = View.inflate(this.context, com.tencent.mm.k.bmN, null);
    EditText localEditText = (EditText)this.fMO.findViewById(com.tencent.mm.i.aOt);
    localEditText.setHint(com.tencent.mm.n.bzN);
    h localh = new h(this, localEditText);
    i locali = new i(this);
    this.fav = e.a(this.context, this.context.getString(com.tencent.mm.n.bzO), this.fMO, localh, locali);
  }

  public final void onDetach()
  {
    bg.qX().b(144, this);
    if (this.jkV != null)
      this.jkV.aUi();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.g
 * JD-Core Version:    0.6.2
 */