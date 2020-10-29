package co.project.partseasy;

import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.Random;

public class BookingAdapter extends RecyclerView.Adapter<BookingViewHolder> {
    private Random random;

    public BookingAdapter(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.booking_items;
    }

    @NonNull
    @Override
    public BookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new BookingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookingViewHolder holder, int position) {
        holder.getView().setText(String.valueOf(random.nextInt()));

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
