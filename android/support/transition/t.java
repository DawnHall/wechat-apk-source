package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

abstract interface t
{
  public abstract <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.t
 * JD-Core Version:    0.6.2
 */