package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.z;

public class MMFormInputView extends LinearLayout
{
  private TextView eyZ;
  private EditText fGo;
  private String hHl;
  private int[] iYX;
  private View.OnFocusChangeListener iYY = null;
  private int layout = -1;
  private Context mContext = null;
  private String title;

  public MMFormInputView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  @TargetApi(11)
  public MMFormInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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

  public final void a(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.iYY = paramOnFocusChangeListener;
  }

  public final void aRH()
  {
    if (this.fGo != null)
    {
      this.fGo.setImeOptions(5);
      return;
    }
    z.e("!44@/B4Tb64lLpIv1x5YYJJy602y4ChVRkG/W7HbnV1dhFk=", "contentET is null!");
  }

  public final void aRI()
  {
    if (this.fGo != null)
    {
      this.fGo.setInputType(3);
      return;
    }
    z.e("!44@/B4Tb64lLpIv1x5YYJJy602y4ChVRkG/W7HbnV1dhFk=", "contentET is null!");
  }

  public final EditText aRJ()
  {
    return this.fGo;
  }

  public final void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    if (this.fGo != null)
    {
      this.fGo.addTextChangedListener(paramTextWatcher);
      return;
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramTextWatcher;
    arrayOfObject[1] = this.fGo;
    z.w("!44@/B4Tb64lLpIv1x5YYJJy602y4ChVRkG/W7HbnV1dhFk=", "watcher : %s, contentET : %s", arrayOfObject);
  }

  public final Editable getText()
  {
    if (this.fGo != null)
      return this.fGo.getText();
    z.e("!44@/B4Tb64lLpIv1x5YYJJy602y4ChVRkG/W7HbnV1dhFk=", "contentET is null!");
    return null;
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
      z.w("!44@/B4Tb64lLpIv1x5YYJJy602y4ChVRkG/W7HbnV1dhFk=", "titleTV : %s, contentET : %s", arrayOfObject);
    }
    while (true)
    {
      if (this.fGo != null)
      {
        az localaz = new az(this);
        this.fGo.setOnFocusChangeListener(localaz);
      }
      return;
      if (this.title != null)
        this.eyZ.setText(this.title);
      if (this.hHl != null)
        this.fGo.setHint(this.hHl);
    }
  }

  public final void setText(String paramString)
  {
    if (this.fGo != null)
    {
      this.fGo.setText(paramString);
      return;
    }
    z.e("!44@/B4Tb64lLpIv1x5YYJJy602y4ChVRkG/W7HbnV1dhFk=", "contentET is null!");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormInputView
 * JD-Core Version:    0.6.2
 */