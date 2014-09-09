package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.p;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.widget.d;

public class MMFormMobileInputView extends LinearLayout
{
  private String hHl;
  private String iPf = "";
  private EditText iQn;
  private int[] iYX;
  private EditText iZa;
  private bd iZb = null;
  private Context mContext = null;

  public MMFormMobileInputView(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
  }

  public MMFormMobileInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  @TargetApi(11)
  public MMFormMobileInputView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cwO, paramInt, 0);
    this.hHl = localTypedArray.getString(p.cwP);
    localTypedArray.recycle();
    inflate(paramContext, k.biu, this);
    this.mContext = paramContext;
  }

  private void ap(View paramView)
  {
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = paramView.getPaddingLeft();
    arrayOfInt[1] = paramView.getPaddingTop();
    arrayOfInt[2] = paramView.getPaddingRight();
    arrayOfInt[3] = paramView.getPaddingBottom();
    this.iYX = arrayOfInt;
  }

  private void aq(View paramView)
  {
    if (this.iYX != null)
      paramView.setPadding(this.iYX[0], this.iYX[1], this.iYX[2], this.iYX[3]);
  }

  public final void a(bd parambd)
  {
    this.iZb = parambd;
  }

  public final String aRK()
  {
    if (this.iZa != null)
      return be.AV(this.iZa.getText().toString());
    return "";
  }

  public final EditText aRL()
  {
    return this.iQn;
  }

  public final EditText aRM()
  {
    return this.iZa;
  }

  public final void eO(boolean paramBoolean)
  {
    ap(this.iQn);
    if (paramBoolean)
    {
      this.iQn.setBackgroundResource(h.VZ);
      aq(this.iQn);
      ap(this.iZa);
      if (!paramBoolean)
        break label74;
      this.iZa.setBackgroundResource(h.Wb);
    }
    while (true)
    {
      aq(this.iZa);
      return;
      this.iQn.setBackgroundResource(h.Wa);
      break;
      label74: this.iZa.setBackgroundResource(h.Wc);
    }
  }

  public final String getCountryCode()
  {
    if (this.iQn != null)
      return this.iQn.getText().toString().trim();
    return "";
  }

  public void onFinishInflate()
  {
    this.iQn = ((EditText)findViewById(i.aoW));
    this.iZa = ((EditText)findViewById(i.aEL));
    if ((this.iQn == null) || (this.iZa == null))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.iQn;
      arrayOfObject[1] = this.iZa;
      z.w("!44@/B4Tb64lLpLJ0gQcBqq1VNhsQPYjnP2P5/VEOFZcz1c=", "countryCodeET : %s, mobileNumberET : %s", arrayOfObject);
      if ((this.iQn != null) && (this.iZa != null))
      {
        if ((!this.iQn.hasFocus()) && (!this.iZa.hasFocus()))
          break label206;
        eO(true);
      }
    }
    while (true)
    {
      ba localba = new ba(this);
      this.iQn.setOnFocusChangeListener(localba);
      this.iZa.setOnFocusChangeListener(localba);
      this.iZa.addTextChangedListener(new d(this.iZa, null, 20));
      this.iZa.addTextChangedListener(new bb(this));
      this.iQn.addTextChangedListener(new bc(this));
      return;
      if (this.hHl == null)
        break;
      this.iZa.setHint(this.hHl);
      break;
      label206: eO(false);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFormMobileInputView
 * JD-Core Version:    0.6.2
 */