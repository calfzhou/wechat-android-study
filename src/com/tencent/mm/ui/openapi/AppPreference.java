package com.tencent.mm.ui.openapi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.p;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.base.preference.Preference;

public class AppPreference extends Preference
{
  private Context context;
  private AdapterView.OnItemClickListener iZR = null;
  private int jJS = 0;
  private e jJU;
  private AdapterView.OnItemClickListener jJV = null;
  private View.OnClickListener jJW = null;
  private int jJX;
  private boolean jJY = false;
  private int jJZ = 0;

  public AppPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public AppPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AppPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvP);
    this.jJX = localTypedArray.getInt(p.cvQ, 8);
    this.jJY = localTypedArray.getBoolean(p.cvR, false);
    this.jJZ = localTypedArray.getResourceId(p.cvS, 0);
    localTypedArray.recycle();
  }

  public final void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.jJV = paramOnItemClickListener;
  }

  public final void aYK()
  {
    e locale;
    if (this.jJU != null)
    {
      locale = this.jJU;
      if (this.jJU.aYJ())
        break label30;
    }
    label30: for (boolean bool = true; ; bool = false)
    {
      locale.fQ(bool);
      return;
    }
  }

  public final k mJ(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jJU.getCount()))
      return null;
    return (k)this.jJU.getItem(paramInt);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(i.awW);
    this.jJU = new e(this.context, this.jJS);
    localMMGridView.setAdapter(this.jJU);
    localMMGridView.setOnItemClickListener(new g(this));
    if (this.jJY)
      localMMGridView.setOnItemLongClickListener(new h(this));
    TextView localTextView = (TextView)paramView.findViewById(i.arH);
    if (this.jJU.getCount() == 0)
    {
      localTextView.setVisibility(0);
      localTextView.setText(this.jJZ);
      localMMGridView.setVisibility(8);
    }
    while (true)
    {
      Button localButton = (Button)paramView.findViewById(i.aks);
      localButton.setVisibility(this.jJX);
      localButton.setOnClickListener(this.jJW);
      return;
      localTextView.setVisibility(8);
      localMMGridView.setVisibility(0);
    }
  }

  public final void onPause()
  {
    if (this.jJU != null)
      bf.GO().h(this.jJU);
  }

  public final void onResume()
  {
    if (this.jJU != null)
      bf.GO().g(this.jJU);
  }

  public final void qH(int paramInt)
  {
    this.jJS = paramInt;
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.iZR = paramOnItemClickListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.AppPreference
 * JD-Core Version:    0.6.2
 */