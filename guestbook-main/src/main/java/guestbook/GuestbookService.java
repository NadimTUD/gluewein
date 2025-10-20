package guestbook;

import org.springframework.stereotype.Service;

@Service
public class GuestbookService {

    private final GuestbookRepository repository;

    public GuestbookService(GuestbookRepository repository) {
        this.repository = repository;
    }

    public long getNumberOfPosts() {
        return repository.count();
    }
}