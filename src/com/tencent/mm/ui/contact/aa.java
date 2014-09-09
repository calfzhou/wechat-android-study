package com.tencent.mm.ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.n.m;
import com.tencent.mm.ui.base.MaskLayout;

public final class aa extends RelativeLayout
{
  private Context context;
  private View erf = null;
  private View fPf = null;
  private TextView jxX = null;

  public aa(Context paramContext, ae paramae)
  {
    super(paramContext);
    this.context = paramContext;
    View.inflate(getContext(), k.baE, this);
    this.erf = findViewById(i.aoI);
    this.fPf = this.erf.findViewById(i.aeN);
    this.jxX = ((TextView)this.fPf.findViewById(i.aeP));
    this.erf.setOnClickListener(new ab(this, paramae));
    this.fPf.setOnTouchListener(new ac(this));
    ImageView localImageView = (ImageView)((MaskLayout)this.fPf.findViewById(i.aeO)).getContentView();
    switch (ad.jya[paramae.ordinal()])
    {
    default:
      return;
    case 1:
      this.fPf.setBackgroundResource(h.Uj);
      this.jxX.setText(n.brW);
      m.a(getContext(), localImageView, "avatar/default_chatroom.png");
      return;
    case 2:
    }
    this.fPf.setBackgroundResource(h.Uj);
    this.jxX.setText(n.brZ);
    m.a(getContext(), localImageView, "avatar/default_contactlabel.png");
  }

  public final void setVisible(boolean paramBoolean)
  {
    View localView = this.erf;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.aa
 * JD-Core Version:    0.6.2
 */