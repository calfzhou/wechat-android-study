package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.aq.a;
import com.tencent.mm.k;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.ArrayList;
import java.util.Iterator;

public class MMAutoSwitchEditTextView extends LinearLayout
{
  private int ffJ;
  private int gao;
  private int iYr;
  private int iYs;
  private String iYt;
  private ArrayList iYu = new ArrayList();
  private ao iYv = new ao(this, (byte)0);
  private am iYw;
  private an iYx;
  private int iYy = 100;
  private Context mContext;

  public MMAutoSwitchEditTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMAutoSwitchEditTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvT);
    this.iYr = localTypedArray.getInteger(p.cvU, 3);
    this.ffJ = localTypedArray.getInteger(p.cvX, 4);
    this.iYs = localTypedArray.getInteger(p.cvW, 2);
    this.iYt = localTypedArray.getString(p.cvV);
    localTypedArray.recycle();
    if ((paramContext instanceof Activity))
    {
      this.gao = ((Activity)paramContext).getWindowManager().getDefaultDisplay().getWidth();
      this.iYy = ((-80 + this.gao - 20 * (-1 + this.iYr)) / this.iYr);
    }
    setPadding(a.fromDPToPix(paramContext, 20), 0, a.fromDPToPix(paramContext, 20), 0);
    aRF();
  }

  private void aRF()
  {
    int i = 0;
    if (i < this.iYr)
    {
      MMAutoSwitchEditText localMMAutoSwitchEditText = (MMAutoSwitchEditText)View.inflate(this.mContext, k.bbh, null);
      localMMAutoSwitchEditText.setInputType(this.iYs);
      if ((this.iYt != null) && (this.iYt.length() > 0))
        localMMAutoSwitchEditText.setKeyListener(DigitsKeyListener.getInstance(this.iYt));
      localMMAutoSwitchEditText.setIndex(i);
      localMMAutoSwitchEditText.pp(this.ffJ);
      localMMAutoSwitchEditText.a(this.iYv);
      localMMAutoSwitchEditText.a(this.iYv);
      localMMAutoSwitchEditText.a(this.iYv);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.iYy, -2);
      if (i > 0);
      for (localLayoutParams.leftMargin = 20; ; localLayoutParams.leftMargin = 0)
      {
        localLayoutParams.weight = 1.0F;
        localMMAutoSwitchEditText.setLayoutParams(localLayoutParams);
        this.iYu.add(localMMAutoSwitchEditText);
        addView(localMMAutoSwitchEditText);
        i++;
        break;
      }
    }
  }

  public final void a(am paramam)
  {
    this.iYw = paramam;
  }

  public final void a(an paraman)
  {
    this.iYx = paraman;
  }

  public final String getText()
  {
    Object localObject1 = "";
    Iterator localIterator = this.iYu.iterator();
    MMAutoSwitchEditText localMMAutoSwitchEditText;
    if (localIterator.hasNext())
    {
      localMMAutoSwitchEditText = (MMAutoSwitchEditText)localIterator.next();
      if (ch.jb(localMMAutoSwitchEditText.getText().toString().trim()))
        break label83;
    }
    label83: for (Object localObject2 = (String)localObject1 + localMMAutoSwitchEditText.getText().toString().trim(); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      return localObject1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoSwitchEditTextView
 * JD-Core Version:    0.6.2
 */