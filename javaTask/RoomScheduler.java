import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomScheduler {
     private Map<String, MeetingRoom> roomMap;

    public RoomScheduler() {
        this.roomMap = new HashMap<>();
    }

    // Add a new meeting room to the scheduler
    public void addMeetingRoom(MeetingRoom room) {
        roomMap.put(room.getRoomId(), room);
        System.out.println("Room added: " + room.getRoomName() + ", ID: " + room.getRoomId());
    }

    // Attempt to book a meeting room with required features
    public void bookRoom(String roomId, EnumSet<RoomFeature> requiredFeatures) {
        MeetingRoom room = roomMap.get(roomId);
        if (room != null && room.getFeatures().containsAll(requiredFeatures)) {
            System.out.println("Room " + roomId + " booked successfully.");
        } else {
            System.out.println("Room " + roomId + " does not meet the required features.");
        }
    }

    // List available rooms that match required features
    public void listAvailableRooms(EnumSet<RoomFeature> requiredFeatures) {
        List<String> availableRooms = new ArrayList<>();
        for (MeetingRoom room : roomMap.values()) {
            if (room.getFeatures().containsAll(requiredFeatures)) {
                availableRooms.add(room.getRoomName());
            }
        }
        System.out.println("Available rooms with " + requiredFeatures + ": " + availableRooms);
    }
}


