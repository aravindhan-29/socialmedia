import React from "react";
import PopularUserCard from "./PopularUserCard";
import SearchUser from "../SearchUser/SearchUser";
import { useNavigate } from "react-router-dom";

const popularUser = [
  { id: 1, userImage: "https://randomuser.me/api/portraits/men/1.jpg", username: "John Doe", description: "Follows you" },
  { id: 2, userImage: "https://randomuser.me/api/portraits/women/2.jpg", username: "Jane Smith", description: "New to the platform" },
  { id: 3, userImage: "https://randomuser.me/api/portraits/men/3.jpg", username: "Mike Johnson", description: "Suggested for you" },
  { id: 4, userImage: "https://randomuser.me/api/portraits/women/4.jpg", username: "Sarah Lee", description: "Friends with Porselvan" },
];

const HomeRight = () => {
  const navigate = useNavigate();

  const handleUserClick = (userId) => {
    navigate(`/profile/${userId}`);
  };

  return (
    <div className="pr-5">
      <SearchUser handleClick={handleUserClick} />
      <div className="card p-5">
        <div className="flex justify-between py-5 items-center">
          <p className="font-semibold opacity-70">Suggestions for you</p>
          <p className="text-xs font-semibold opacity-95">View All</p>
        </div>

        <div className="space-y-5">
          {popularUser.map((user) => (
            <PopularUserCard
              key={user.id}
              image={user.userImage}
              username={user.username} 
              description={user.description} 
            />
          ))}
        </div>
      </div>
    </div>
  );
};

export default HomeRight;
