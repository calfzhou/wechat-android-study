package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.z;

public class MMFormSelectorView extends LinearLayout
{
  private TextView eyZ;
  private EditText fGo;
  private String hHl;
  private int layout = -1;
  private Context mContext = null;
  private String title;

  public MMFormSelectorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  @TargetApi(11)
  public MMFormSelectorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cwO, paramInt, 0);
    this.hHl = localTypedArray.getString(p.cwP);
    this.title = localTypedArray.getString(p.cwR);
    this.layout = localTypedArray.getResourceId(p.cwQ, this.layout);
    localTypedArray.recycle();
    inflate(paramContext, this.layout, this);
    this.mContext = paramContext;
  }

  public void onFinishInflate()
  {
    this.eyZ = ((TextView)findViewById(i.title));
    this.fGo = ((EditText)findViewById(i.aqy));
    if ((this.eyZ == null) || (this.fGo == null))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.eyZ;
      arrayOfObject[1] = this.fGo;
      z.w("!44@/B4Tb64lLpJ8BAbMMHKVKaUQT1HXPsOOAEYFIKZorxg=", "titleTV : %s, contentET : %s", arrayOfObject);
    }
    do
    {
      return;
      if (this.title != null)
        this.eyZ.setText(this.title);
    }
    while (this.hHl == null);
    this.fGo.setHint(this.hHl);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormSelectorView
 * JD-Core Version:    0.6.2
 */