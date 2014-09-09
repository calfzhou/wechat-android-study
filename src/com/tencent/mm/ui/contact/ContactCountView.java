package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.l;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;

public class ContactCountView extends FrameLayout
{
  private int count = 0;
  private View erf;
  private TextView jys;
  private int jyt = 1;
  private boolean visible = true;

  public ContactCountView(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public ContactCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  private void init()
  {
    inflate(getContext(), k.bdw, this);
  }

  public final void aWQ()
  {
    this.jyt = 2;
  }

  public final void aWR()
  {
    String[] arrayOfString1 = y.dko;
    if (this.jyt == 1)
    {
      o localo2 = bg.qW().oT();
      String[] arrayOfString3 = new String[4];
      arrayOfString3[0] = x.pG();
      arrayOfString3[1] = "weixin";
      arrayOfString3[2] = "helper_entry";
      arrayOfString3[3] = "filehelper";
      this.count = localo2.b(arrayOfString1, arrayOfString3);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(this.count);
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXSk7cqwPRO/WN0MHMKg7BqI=", "contact count %d", arrayOfObject1);
      if (this.jys != null)
      {
        if (this.jyt != 1)
          break label218;
        TextView localTextView2 = this.jys;
        Resources localResources2 = getContext().getResources();
        int k = l.bqy;
        int m = this.count;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(this.count);
        localTextView2.setText(localResources2.getQuantityString(k, m, arrayOfObject3));
      }
    }
    while (true)
    {
      setVisible(this.visible);
      return;
      o localo1 = bg.qW().oT();
      String[] arrayOfString2 = new String[4];
      arrayOfString2[0] = x.pG();
      arrayOfString2[1] = "weixin";
      arrayOfString2[2] = "helper_entry";
      arrayOfString2[3] = "filehelper";
      this.count = localo1.c(arrayOfString1, arrayOfString2);
      break;
      label218: TextView localTextView1 = this.jys;
      Resources localResources1 = getContext().getResources();
      int i = l.bqx;
      int j = this.count;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.count);
      localTextView1.setText(localResources1.getQuantityString(i, j, arrayOfObject2));
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXSk7cqwPRO/WN0MHMKg7BqI=", "onMeasure");
    if (this.erf == null)
    {
      this.erf = ((FrameLayout)findViewById(i.anw));
      this.jys = ((TextView)findViewById(i.anv));
    }
    aWR();
    super.onMeasure(paramInt1, paramInt2);
  }

  public final void setVisible(boolean paramBoolean)
  {
    this.visible = paramBoolean;
    View localView;
    if (this.erf != null)
    {
      localView = this.erf;
      if ((!paramBoolean) || (this.count <= 0))
        break label36;
    }
    label36: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactCountView
 * JD-Core Version:    0.6.2
 */