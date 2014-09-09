package com.tencent.mm.ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.g.a;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.MaskLayout;

public final class co extends LinearLayout
{
  private Context context;
  private String dqM;

  public co(Context paramContext, String paramString)
  {
    super(paramContext);
    this.context = paramContext;
    this.dqM = paramString;
    View localView1 = View.inflate(getContext(), k.beA, this);
    View localView2 = findViewById(com.tencent.mm.i.arM);
    localView1.setOnClickListener(new cp(this));
    localView2.setOnTouchListener(new cq(this));
    com.tencent.mm.storage.i locali = bg.qW().oT().yq(this.dqM);
    if ((locali == null) || ((int)locali.dhv <= 0))
    {
      z.e("!44@/B4Tb64lLpIXzeB5NZbbB0Dbk9yEMsmydlgerSS6++U=", "contact is null");
      return;
    }
    c.a((ImageView)((MaskLayout)localView2.findViewById(com.tencent.mm.i.ajp)).getContentView(), this.dqM);
    ((TextView)findViewById(com.tencent.mm.i.arN)).setText(locali.oc());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.co
 * JD-Core Version:    0.6.2
 */