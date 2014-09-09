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
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class ServicePreference extends Preference
{
  private Context context;
  private List hKR;
  private AdapterView.OnItemClickListener iZR = null;
  private AdapterView.OnItemClickListener jJV = null;
  private View.OnClickListener jJW = null;
  private int jJX;
  private boolean jJY = false;
  private int jJZ = 0;
  private l jKn;

  public ServicePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ServicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(com.tencent.mm.k.baW);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvP);
    this.jJX = localTypedArray.getInt(p.cvQ, 8);
    this.jJY = localTypedArray.getBoolean(p.cvR, false);
    this.jJZ = localTypedArray.getResourceId(p.cvS, 0);
    localTypedArray.recycle();
  }

  public final void aYK()
  {
    l locall;
    if (this.jKn != null)
    {
      locall = this.jKn;
      if (this.jKn.aYJ())
        break label30;
    }
    label30: for (boolean bool = true; ; bool = false)
    {
      locall.fQ(bool);
      return;
    }
  }

  public final void bk(List paramList)
  {
    this.hKR = paramList;
  }

  public final com.tencent.mm.pluginsdk.model.app.k mJ(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jKn.getCount()))
      return null;
    return (com.tencent.mm.pluginsdk.model.app.k)this.jKn.getItem(paramInt);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    MMGridView localMMGridView = (MMGridView)paramView.findViewById(i.awW);
    if (localMMGridView == null)
      return;
    this.jKn = new l(this.context, this.hKR);
    bf.GO().h(this.jKn);
    bf.GO().g(this.jKn);
    localMMGridView.setAdapter(this.jKn);
    localMMGridView.setOnItemClickListener(new q(this));
    if (this.jJY)
      localMMGridView.setOnItemLongClickListener(new r(this));
    TextView localTextView = (TextView)paramView.findViewById(i.arH);
    if (this.jKn.getCount() == 0)
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
    if (this.jKn != null)
      bf.GO().h(this.jKn);
  }

  public final void onResume()
  {
    if (this.jKn != null)
      bf.GO().g(this.jKn);
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.iZR = paramOnItemClickListener;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.ServicePreference
 * JD-Core Version:    0.6.2
 */