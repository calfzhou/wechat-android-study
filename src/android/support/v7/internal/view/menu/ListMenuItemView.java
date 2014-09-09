package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.p;

public class ListMenuItemView extends LinearLayout
  implements ah
{
  private LayoutInflater gJ;
  private s jI;
  private ImageView kF;
  private RadioButton kG;
  private TextView kH;
  private CheckBox kI;
  private TextView kJ;
  private Drawable kK;
  private int kL;
  private Context kM;
  private boolean kN;
  private int kO;
  private boolean kP;
  private Context mContext;

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cxZ, paramInt, 0);
    this.kK = localTypedArray.getDrawable(p.cya);
    this.kL = localTypedArray.getResourceId(p.cyb, -1);
    this.kN = localTypedArray.getBoolean(p.cyc, false);
    this.kM = paramContext;
    localTypedArray.recycle();
  }

  private LayoutInflater bG()
  {
    if (this.gJ == null)
      this.gJ = LayoutInflater.from(this.mContext);
    return this.gJ;
  }

  public final void a(s params)
  {
    this.jI = params;
    this.kO = 0;
    int i;
    label60: Object localObject1;
    Object localObject2;
    label149: int m;
    label174: label213: int j;
    label242: int k;
    label308: Drawable localDrawable2;
    if (params.isVisible())
    {
      i = 0;
      setVisibility(i);
      CharSequence localCharSequence = params.a(this);
      if (localCharSequence == null)
        break label441;
      this.kH.setText(localCharSequence);
      if (this.kH.getVisibility() != 0)
        this.kH.setVisibility(0);
      boolean bool1 = params.isCheckable();
      if ((bool1) || (this.kG != null) || (this.kI != null))
      {
        if (!this.jI.cb())
          break label465;
        if (this.kG == null)
        {
          this.kG = ((RadioButton)bG().inflate(k.bau, this, false));
          addView(this.kG);
        }
        RadioButton localRadioButton2 = this.kG;
        CheckBox localCheckBox2 = this.kI;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!bool1)
          break label529;
        ((CompoundButton)localObject1).setChecked(this.jI.isChecked());
        if (!bool1)
          break label522;
        m = 0;
        if (((CompoundButton)localObject1).getVisibility() != m)
          ((CompoundButton)localObject1).setVisibility(m);
        if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8))
          ((CompoundButton)localObject2).setVisibility(8);
      }
      boolean bool2 = params.ca();
      params.bY();
      if ((!bool2) || (!this.jI.ca()))
        break label564;
      j = 0;
      if (j == 0)
        this.kJ.setText(this.jI.bZ());
      if (this.kJ.getVisibility() != j)
        this.kJ.setVisibility(j);
      Drawable localDrawable1 = params.getIcon();
      if ((!this.jI.cc()) && (!this.kP))
        break label571;
      k = 1;
      if (((k != 0) || (this.kN)) && ((this.kF != null) || (localDrawable1 != null) || (this.kN)))
      {
        if (this.kF == null)
        {
          this.kF = ((ImageView)bG().inflate(k.bas, this, false));
          addView(this.kF, 0);
        }
        if ((localDrawable1 == null) && (!this.kN))
          break label583;
        ImageView localImageView = this.kF;
        if (k == 0)
          break label577;
        localDrawable2 = localDrawable1;
        label401: localImageView.setImageDrawable(localDrawable2);
        if (this.kF.getVisibility() != 0)
          this.kF.setVisibility(0);
      }
    }
    while (true)
    {
      setEnabled(params.isEnabled());
      return;
      i = 8;
      break;
      label441: if (this.kH.getVisibility() == 8)
        break label60;
      this.kH.setVisibility(8);
      break label60;
      label465: if (this.kI == null)
      {
        this.kI = ((CheckBox)bG().inflate(k.bar, this, false));
        addView(this.kI);
      }
      CheckBox localCheckBox1 = this.kI;
      RadioButton localRadioButton1 = this.kG;
      localObject1 = localCheckBox1;
      localObject2 = localRadioButton1;
      break label149;
      label522: m = 8;
      break label174;
      label529: if (this.kI != null)
        this.kI.setVisibility(8);
      if (this.kG == null)
        break label213;
      this.kG.setVisibility(8);
      break label213;
      label564: j = 8;
      break label242;
      label571: k = 0;
      break label308;
      label577: localDrawable2 = null;
      break label401;
      label583: this.kF.setVisibility(8);
    }
  }

  public final void bF()
  {
    this.kP = true;
    this.kN = true;
  }

  public final s bp()
  {
    return this.jI;
  }

  public final boolean bq()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.kK);
    this.kH = ((TextView)findViewById(i.title));
    if (this.kL != -1)
      this.kH.setTextAppearance(this.kM, this.kL);
    this.kJ = ((TextView)findViewById(i.aQg));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.kF != null) && (this.kN))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.kF.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0))
        localLayoutParams1.width = localLayoutParams.height;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ListMenuItemView
 * JD-Core Version:    0.6.2
 */