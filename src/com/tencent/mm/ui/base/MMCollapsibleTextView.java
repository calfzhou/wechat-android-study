package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;

public class MMCollapsibleTextView extends LinearLayout
{
  private Context context;
  private TextView dYT;
  private Runnable eOV = new at(this);
  private TextView gBP;
  private boolean gBQ = true;
  private String gBR;
  private String gBS;
  private int guZ;
  private SparseIntArray iYF = new SparseIntArray();

  public MMCollapsibleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    this.gBR = this.context.getString(n.clD);
    this.gBS = this.context.getString(n.cjH);
    View localView = inflate(this.context, k.bir, this);
    localView.setPadding(0, -3, 0, 0);
    this.dYT = ((TextView)localView.findViewById(i.apF));
    this.gBP = ((TextView)localView.findViewById(i.apE));
    this.gBP.setOnClickListener(new as(this));
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.gBQ)
      return;
    this.gBQ = true;
    if (this.dYT.getLineCount() <= 10)
    {
      this.iYF.put(this.guZ, 0);
      return;
    }
    this.iYF.put(this.guZ, 1);
    post(this.eOV);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMCollapsibleTextView
 * JD-Core Version:    0.6.2
 */